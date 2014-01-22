package pl.finsys.structural.decorator.example2;

/**
 * Place description here.
 *
 * @author jarek@finsys.pl
 */

// Decorator
public class Decorator implements Currency {
    private Currency originalRef;

    protected Decorator(Currency originalRef) {
        this.originalRef = originalRef;
    }

    public String getCurrencyDescription() {
        return "Decorated " + originalRef.getCurrencyDescription();
    }
}