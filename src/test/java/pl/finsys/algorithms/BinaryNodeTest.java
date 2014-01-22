package pl.finsys.algorithms;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.finsys.alogrithms.Node;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class BinaryNodeTest {

    @BeforeTest
    public Node createSampleTree() {
        Node node8 = new Node(8, "eight");
        Node node3 = new Node(3, "three");
        Node node10 = new Node(10, "ten");
        Node node1 = new Node(1, "one");
        Node node6 = new Node(6, "six");
        Node node4 = new Node(4, "four");
        Node node7 = new Node(7, "seven");
        Node node14 = new Node(14, "fourteen");
        Node node13 = new Node(13, "fifteen");

        node8.addLeft(node3);
        node8.addRight(node10);
        node3.addLeft(node1);
        node3.addRight(node6);
        node6.addLeft(node4);
        node6.addRight(node7);
        node10.addRight(node14);
        node14.addLeft(node13);
        return node8;
    }



    @Test
    public void recursiveSearch() {
        Node root = createSampleTree();
        Node found = root.findNodeRecursive(4);
        assertThat(found.getValue().equals("four"));


    }


    @Test
    public void iterativeSearch() {
        Node root = createSampleTree();
        Node found = root.findNodeIterative(4);
        assertThat(found.getValue().equals("four"));
    }

}
