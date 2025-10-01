package LLD.ChainOfResposibility;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==INFO){
            System.out.println("INFO: "+message);
        }
        else if (nextLoggerProcessor != null) {
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
