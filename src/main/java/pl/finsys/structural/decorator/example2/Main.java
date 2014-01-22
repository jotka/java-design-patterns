package pl.finsys.structural.decorator.example2;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class Main {
    public static void main(String[] args) {

        // without adding decorators
        Currency curr = new Dollar();
        System.out.println(curr.getCurrencyDescription());


        //adding decorators
        Currency currency2 = new DecoratorUSDollar(curr);

        System.out.println(currency2.getCurrencyDescription());

        Currency currency3 = new DecoratorCanadianDollar(curr);

        System.out.println(currency3.getCurrencyDescription());
    }

}


