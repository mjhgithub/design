package com.mark.icohome.design.abstractfactory;

/**
 * @author mjh
 */

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
