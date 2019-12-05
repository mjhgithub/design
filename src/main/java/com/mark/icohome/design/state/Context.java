package com.mark.icohome.design.state;

/**
 * @author mjh
 */

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void request() {
        if (state != null) {
            state.doAction(this);
        }
    }

}
