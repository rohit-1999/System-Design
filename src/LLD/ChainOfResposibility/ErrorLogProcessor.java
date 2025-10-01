package LLD.ChainOfResposibility;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==ERROR){
            System.out.println("Error: "+message);
        }
        else if (nextLoggerProcessor != null) {
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
