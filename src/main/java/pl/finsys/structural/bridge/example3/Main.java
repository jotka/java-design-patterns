package pl.finsys.structural.bridge.example3;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class Main {
    public static void main(String[] args) {
        Shape triangle = new ShapeTriangle(new ColorRed());
        triangle.applyColor();

        Shape square = new ShapeSquare(new ColorGreen());
        square.applyColor();

    }
}
