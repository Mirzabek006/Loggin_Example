package pdp.uz;

import java.util.logging.*;

public class LoggingExample implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getLevel() == Level.SEVERE;//Faqat  SEVERE darajasidagi xabar

    }
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());
    public static void main(String[] args){
        logger.setLevel(Level.ALL);
        // filter qo'shish
        logger.setFilter(new LoggingExample());

        //Handler qo'shish
        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);
        // Test loglari
        logger.info("Bu info darajasidagi xabar"); //Ko'rinmaydi
        logger.warning("Bu warning darajasidagi xabar");//Ko'rinmaydi
        logger.severe("Bu severe xabar");//Ko'rinadi
    }

}
