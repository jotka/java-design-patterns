package pl.finsys.behavioral.state;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class StateContext {
    private Statelike myState;

    /**
     * Standard constructor
     */
    public StateContext() {
        setState(new StateA());
    }

    /**
     * Setter method for the state.
     * Normally only called by classes implementing the State interface.
     *
     * @param newState the new state of this context
     */
    void setState(final Statelike newState) {
        myState = newState;
    }

    /**
     * Writer method
     *
     * @param name the name to be written
     */
    public void writeName(final String name) {
        myState.writeName(this, name);
    }
}