package pl.finsys.structural.bridge.example3;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class ShapeTriangle extends Shape {
    public ShapeTriangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("[Triangle] filled with color ");
        color.applyColor();
    }
}
