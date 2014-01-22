package pl.finsys.structural.decorator.example1;

public class WindowDecorated implements Window {

    /**
     * private reference to the window being decorated
     */
    private Window privateWindowReference = null;

    public WindowDecorated(Window windowRefernce) {

        this.privateWindowReference = windowRefernce;
    }

    @Override
    public void renderWindow() {

        privateWindowReference.renderWindow();

    }

}
