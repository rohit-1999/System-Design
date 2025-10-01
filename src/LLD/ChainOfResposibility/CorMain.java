package LLD.ChainOfResposibility;

public class CorMain {
    public static void main(String[] args) {
      LogProcessor logger = new DebugLogProcessor(new InfoLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogProcessor.ERROR,"Exception happens");
        logger.log(LogProcessor.DEBUG,"need to debug this");
        logger.log(LogProcessor.INFO,"this is just for info");
    }
}
