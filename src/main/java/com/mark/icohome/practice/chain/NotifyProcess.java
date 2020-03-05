package com.mark.icohome.practice.chain;

public class NotifyProcess extends AbstractProcess {

    @Override
    protected void doOperate(ProcessData processData) {
        if (false == processData.isAlarm()) {
            return;
        }
        System.out.println("NotifyProcess alarm");
    }
}
