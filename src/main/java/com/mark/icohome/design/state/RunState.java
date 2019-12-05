package com.mark.icohome.design.state;

/**
 * @author mjh
 */

public class RunState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in run state");
//        context.setState(this);
        context.setState(new StopState());

        context.request();
    }

    @Override
    public String toString(){
        return "Run State";
    }
}
