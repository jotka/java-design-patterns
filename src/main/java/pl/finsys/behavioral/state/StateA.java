package pl.finsys.behavioral.state;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class StateA implements Statelike {

    @Override
    public void writeName(final StateContext context, final String name) {
        System.out.println(name.toLowerCase());
        context.setState(new StateB());
    }
}
