package com.mark.icohome.design.singleton;

/**
 * @author mjh
 */

public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static synchronized SingletonHungry getInstance() {
        return instance;
    }
}
