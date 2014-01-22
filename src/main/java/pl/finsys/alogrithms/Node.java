package pl.finsys.alogrithms;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class Node {
    private int key;
    private String value;
    private Node left;
    private Node right;

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " - " + value;
    }

    public void addLeft(Node left) {
        this.left = left;
    }

    public void addRight(Node right) {
        this.right = right;
    }

    public Node findNodeRecursive(int key) {
        System.out.println("this = " + this.key + ", looking for key " + key);
        Node found = null;

        if (this.key == key) found = this;

        else if (key < this.key) {
            System.out.println("< left");
            found = this.left != null ? this.left.findNodeRecursive(key) : null;
        } else if (key > this.key) {
            System.out.println("> right");
            found = this.right != null ? this.right.findNodeRecursive(key) : null;
        }
        return found;
    }


    public Node findNodeIterative(int key) {
        Node currentNode = this;
        while (currentNode != null) {
            if (currentNode.key == key) return currentNode;
            else if (key < currentNode.key) currentNode = currentNode.left;
            else if (key > currentNode.key) currentNode = currentNode.right;
        }
        return null;
    }
}
