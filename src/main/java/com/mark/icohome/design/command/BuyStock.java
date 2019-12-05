package com.mark.icohome.design.command;

/**
 * @author mjh
 */

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }


    @Override
    public void execute() {
        abcStock.buy();
    }
}
