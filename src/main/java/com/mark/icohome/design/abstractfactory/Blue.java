package com.mark.icohome.design.abstractfactory;

/**
 * @author mjh
 */

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}