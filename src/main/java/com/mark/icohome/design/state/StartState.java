package com.mark.icohome.design.state;

/**
 * @author mjh
 */

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
//        context.setState(this);
        context.setState(new RunState());

        context.request();
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
