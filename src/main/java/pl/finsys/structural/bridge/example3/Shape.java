package pl.finsys.structural.bridge.example3;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public abstract class Shape {
    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
