package com.mark.icohome.design.chain;

/**
 * @author mjh
 */

public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        //设置责任链
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        //返回链头
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        System.out.println("===============");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        System.out.println("===============");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
