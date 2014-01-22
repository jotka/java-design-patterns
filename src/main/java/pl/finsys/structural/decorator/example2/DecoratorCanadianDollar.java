package pl.finsys.structural.decorator.example2;

/**
 * Concrete Decorator
 *
 * @author jarek@finsys.pl
 */

public class DecoratorCanadianDollar extends Decorator {

    protected DecoratorCanadianDollar(Currency originalRef) {
        super(originalRef);
    }


    public String getCurrencyDescription() {
        return "Canadian";
    }


}