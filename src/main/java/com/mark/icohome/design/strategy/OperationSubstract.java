package com.mark.icohome.design.strategy;

/**
 * @author mjh
 */

public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
