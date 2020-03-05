package com.mark.icohome.practice.chain;

import java.util.Date;

public class AlarmChain {

    public static void main(String[] args) {
        System.out.println("AlarmChain start");
        ProcessData processData = new ProcessData();
        processData.setDataDate(new Date());

        AbstractProcess aggregateProcess = new AggregateProcess();
        AbstractProcess indicatorProcess = new IndicatorProcess();
        AbstractProcess judgeProcess = new JudgeProcess();
        AbstractProcess notifyProcess = new NotifyProcess();

        aggregateProcess.setNextProcess(indicatorProcess);
        indicatorProcess.setNextProcess(judgeProcess);
        judgeProcess.setNextProcess(notifyProcess);

        aggregateProcess.goProcess(processData);
        System.out.println("AlarmChain end");
    }
}
