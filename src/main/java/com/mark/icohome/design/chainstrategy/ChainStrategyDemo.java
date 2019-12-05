package com.mark.icohome.design.chainstrategy;

/**
 * @author mjh
 */

public class ChainStrategyDemo {
    private static AbstractOperation getChainOfOperations() {

        AbstractOperation addOperation = new OperationAdd();
        AbstractOperation subOperation = new OperationSubstract();
        AbstractOperation mulOperation = new OperationMultiply();

        addOperation.setNextOperation(subOperation);
        subOperation.setNextOperation(mulOperation);
        return addOperation;
    }

    public static void main(String[] args) {
        AbstractOperation operationChain = getChainOfOperations();
        int result = operationChain.calResult(10, 5);
        System.out.println("result=" + result);

        Context context = new Context();
        context.setStrategy(new OperationAdd());
        context.executeStrategy(10, 5);
        context.setStrategy(new OperationSubstract());
        context.executeStrategy(10, 5);
        context.setStrategy(new OperationMultiply());
        context.executeStrategy(10, 5);
    }
}
