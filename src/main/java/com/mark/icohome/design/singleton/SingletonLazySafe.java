package com.mark.icohome.design.singleton;

/**
 * @author mjh
 */

public class SingletonLazySafe {
    private static SingletonLazySafe instance;

    private SingletonLazySafe() {
    }

    public static synchronized SingletonLazySafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazySafe();
        }
        return instance;
    }
}
