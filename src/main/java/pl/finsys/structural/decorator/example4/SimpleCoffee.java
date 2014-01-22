package pl.finsys.structural.decorator.example4;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

// extension of a simple coffee without any extra ingredients
public class SimpleCoffee extends Coffee {
    public double getCost() {
        return 1;
    }

    public String getIngredients() {
        return "Coffee";
    }
}