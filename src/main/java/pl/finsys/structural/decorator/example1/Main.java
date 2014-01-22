package pl.finsys.structural.decorator.example1;

public class Main {
    public static void main(String[] args) {

        // create a new window

        Window window = new WindowSimple();

        window.renderWindow();

        // at some point later
        // maybe text size becomes larger than the window
        // thus the scrolling behavior must be added

        // decorate old window
        window = new WindowScrollable(window);

        // now window object
        // has additional behavior / state

        window.renderWindow();

    }
}
