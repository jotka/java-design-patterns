package pl.finsys.behavioral.state;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public interface Statelike {
    /**
     * Writer method for the state name.
     *
     * @param context the stateful context
     * @param name    the name to be written
     */
    void writeName(StateContext context, String name);
}
