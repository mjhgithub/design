package com.mark.icohome.design.singleton;

/**
 * @author mjh
 */

public class SingleObject {
    /**
     * 创建一个对象
     */
    private static SingleObject instance = new SingleObject();

    /**
     * 构造函数私有，防止被实例化
     */
    private SingleObject() {
    }

    /**
     * 获取唯一可用对象
     *
     * @return
     */
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
