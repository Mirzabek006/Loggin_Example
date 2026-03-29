package pdp.uz;

import java.util.logging.Logger;

public class LoggingExample2 {
    private static final Logger logger = Logger.getLogger(LoggingExample2.class.getName());
    public static void main(String[] args) {
        logger.info("Dastur boshlandi degan xabar keladi");
        logger.severe("Kritik xato yuz beradi");
        logger.fine("Debug malumoti");
        /*
        log(LEVEL level ,String msg):Belgilangan darajadagi log xabarlarni yozadi
        info(String msg):INFO darajasidagi xabarlarni qabul qiladi.
        warning(String msg):WARNING darajasidagi xabar:
        severe(String msg) SEVERE darajasidagi xabar
        fine(String msg), finer(String msg),finest(String msg): Debugging uchun batafsil xabarlar.

         */

    }
}
