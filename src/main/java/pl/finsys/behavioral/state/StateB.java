package pl.finsys.behavioral.state;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class StateB implements Statelike {
    /**
     * State counter
     */
    private int count = 0;

    @Override
    public void writeName(final StateContext context, final String name) {
        System.out.println(name.toUpperCase());
        /* Change state after StateB's writeName() gets invoked twice */
        if (++count > 1) {
            context.setState(new StateA());
        }
    }

}
