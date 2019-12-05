package com.mark.icohome.design.abstractfactory;

/**
 * @author mjh
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
