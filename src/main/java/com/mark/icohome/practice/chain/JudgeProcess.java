package com.mark.icohome.practice.chain;

import java.util.Random;

public class JudgeProcess extends AbstractProcess {

    @Override
    protected void doOperate(ProcessData processData) {
        Random random = new Random();
        if (random.nextInt(100) > 30) {
            processData.setAlarm(true);
        }
        System.out.println("JudgeProcess");
    }
}
