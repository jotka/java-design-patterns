package pl.finsys.structural.decorator.example1;

public class WindowSimple implements Window {

    @Override
    public void renderWindow() {
        System.out.println("WindowSimple: renderWindow");
    }

}
