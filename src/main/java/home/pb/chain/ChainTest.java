package home.pb.chain;

import org.junit.Test;

public class ChainTest {
    private static AbstractLogger getChainofLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    @Test
    public void chainTest(){
        AbstractLogger loggerChain = getChainofLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");
    }
}
