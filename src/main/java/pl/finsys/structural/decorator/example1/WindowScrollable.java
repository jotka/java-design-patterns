package pl.finsys.structural.decorator.example1;

public class WindowScrollable extends WindowDecorated {

    /**
     * Additional State
     */
    private Object scrollBarObjectRepresentation = null;

    public WindowScrollable(Window windowRefernce) {

        super(windowRefernce);
    }

    @Override
    public void renderWindow() {

        // render scroll bar
        renderScrollBarObject();

        // render decorated window
        super.renderWindow();
    }

    private void renderScrollBarObject() {

        // prepare scroll bar
        scrollBarObjectRepresentation = new Object();

        // render scrollbar

    }

}
