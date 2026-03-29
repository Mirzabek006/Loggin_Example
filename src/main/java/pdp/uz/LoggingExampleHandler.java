package pdp.uz;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/*
ConsoleHandler:Loglarni konsolga chiqaradi.
StreamHandler:Log xabarlarini OutputStream obyektiga yozadi.
FileHandler:Loglarni faylga yozadi.
SocketHandler:Loglarni tarmoq orqali yuboradi.
MemoryHanlder:Xabarlar vaqtincha xotiradan saqlanadi:
 */
public class LoggingExampleHandler {
    private static final Logger logger = Logger.getLogger(LoggingExampleHandler.class.getName());
    public static void main(String[] args) throws IOException {
        FileHandler fh=new FileHandler("app.log");
        logger.addHandler(fh);
        logger.info("Faylga log yozildi");

    }
}
