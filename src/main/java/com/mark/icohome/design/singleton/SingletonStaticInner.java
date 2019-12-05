package com.mark.icohome.design.singleton;

/**
 * @author mjh
 */

public class SingletonStaticInner {
    private static class SingletonHolder {
        private static final SingletonStaticInner INSTANCE = new SingletonStaticInner();
    }

    private SingletonStaticInner() {
    }

    public static final SingletonStaticInner getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
