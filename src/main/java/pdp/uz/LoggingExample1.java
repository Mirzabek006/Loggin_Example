package pdp.uz;

import java.io.IOException;
import java.util.logging.*;

public class LoggingExample1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(LoggingExample1.class.getName());
        logger.setLevel(Level.ALL);

        //FileHandler yaratish va filter qo'shish
        FileHandler fileHandler = new FileHandler("app.log");
        fileHandler.setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                return record.getLevel().intValue() >= Level.WARNING.intValue();
            }
        });
        logger.addHandler(fileHandler);

        //Test loglari
        logger.info("Bu info darajasidagi xabar");//Faylga yozilmaydi
        logger.warning("Bu warning darajasidagi xabar");
        logger.severe("Bu severe xabar");//Faylga yoziladi
    }
}
