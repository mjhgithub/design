package com.mark.icohome.design.facade;

/**
 * @author mjh
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}