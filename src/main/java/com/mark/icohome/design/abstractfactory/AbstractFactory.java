package com.mark.icohome.design.abstractfactory;

/**
 * @author mjh
 */

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
