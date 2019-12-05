package com.mark.icohome.design.state;

/**
 * @author mjh
 */

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
//        context.setState(this);

        System.out.println("=====================");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        context.setState(new StartState());
        context.request();
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}