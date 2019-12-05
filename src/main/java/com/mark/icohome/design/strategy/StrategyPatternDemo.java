package com.mark.icohome.design.strategy;

/**
 * @author mjh
 */

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));



        Context context2 = new Context();
        context2.setStrategy(new OperationAdd());
        System.out.println("10 + 5 = " + context2.executeStrategy(10, 5));

        context2.setStrategy(new OperationSubstract());
        System.out.println("10 - 5 = " + context2.executeStrategy(10, 5));

        context2.setStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context2.executeStrategy(10, 5));
    }
}
