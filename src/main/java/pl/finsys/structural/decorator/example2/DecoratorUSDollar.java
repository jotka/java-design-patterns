package pl.finsys.structural.decorator.example2;

/**
 * Concrete Decorator
 *
 * @author jarek@finsys.pl
 */

public class DecoratorUSDollar extends Decorator {

    Currency currency;


    protected DecoratorUSDollar(Currency originalRef) {
        super(originalRef);
    }

    @Override
    public String getCurrencyDescription() {
        return "USD";
    }
}
