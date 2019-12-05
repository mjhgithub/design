package com.mark.icohome.design.chainstrategy;

/**
 * @author mjh
 */

public abstract class AbstractOperation {

    protected int result = 0;

    protected AbstractOperation nextOperation;

    public void setNextOperation(AbstractOperation nextOperation) {
        this.nextOperation = nextOperation;
    }

    public int calResult(int num1, int num2) {
        result = doOperation(num1, num2);
        if (nextOperation != null) {
            result += nextOperation.calResult(num1, num2);
        }
        return result;
    }

    abstract protected int doOperation(int num1, int num2);
}
