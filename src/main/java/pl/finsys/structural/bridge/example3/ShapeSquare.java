package pl.finsys.structural.bridge.example3;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class ShapeSquare extends Shape {
    public ShapeSquare(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("[Square] filled with color ");
        color.applyColor();
    }
}
