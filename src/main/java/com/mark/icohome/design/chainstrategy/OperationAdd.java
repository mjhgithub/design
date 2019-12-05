package com.mark.icohome.design.chainstrategy;

/**
 * @author mjh
 */

public class OperationAdd extends AbstractOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        result = num1 + num2;
        System.out.println("OperationAdd result=" + result);
        return result;
    }
}
