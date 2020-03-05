package com.mark.icohome.practice.chain;

public abstract class AbstractProcess {

    protected ProcessData processData;

    protected AbstractProcess nextProcess;

    public void setNextProcess(AbstractProcess nextProcess) {
        this.nextProcess = nextProcess;
    }

    public void goProcess(ProcessData processData) {
        doOperate(processData);
        if (null != nextProcess) {
            nextProcess.goProcess(processData);
        }
//        System.out.println("AbstractProcess finish");
    }

    abstract protected void doOperate(ProcessData processData);
}
