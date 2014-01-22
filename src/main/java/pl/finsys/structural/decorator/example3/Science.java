package pl.finsys.structural.decorator.example3;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class Science extends GirlDecorator {

    private Girl girl;

    public Science(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Science";
    }

    public void caltulateStuff() {
        System.out.println("scientific calculation!");
    }
}
