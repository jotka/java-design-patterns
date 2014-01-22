package pl.finsys.structural.decorator.example4;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

// Decorator Sprinkles that mixes sprinkles with coffee
// note it extends CoffeeDecorator
class Sprinkles extends CoffeeDecorator {
    public Sprinkles(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.2;
    }

    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Sprinkles";
    }
}