package pl.finsys.structural.decorator.example2;

/**
 * Simple, not decorated class
 *
 * @author q1wk@nykredit.dk
 */

public class Dollar implements Currency {


    @Override
    public String getCurrencyDescription() {
        return "simply, a dollar";
    }
}

