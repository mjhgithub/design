package com.mark.icohome.practice.chain;

public class AggregateProcess extends AbstractProcess {

    @Override
    protected void doOperate(ProcessData processData) {
        System.out.println("AggregateProcess");
    }
}
