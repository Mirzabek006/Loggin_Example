package pdp.uz;

import java.util.logging.Level;
import java.util.logging.Logger;
/*
       Level class'i -Log xabarlarning muhimlilik darajasini belgilaydi
       Standard darajalar (yuqoridan pastgacha):
       SEVERE(1000):Jiddiy xatolar.
       WARNING(900):Ogohlantirishlar.
       INFO(800):Umumiy ma'lumot.
       CONFIG(700):Konfiguratsiya ma'lumotlari.
       FINE(500):Oddiy debug malumotlari.
       FINER(400):Batafsilroq debug.
       FINEST(300):Eng batafsil debug.
       ALL:Barcha xabarlarni yoqish.
       OFF:LOGGINGNI o'chirish.

        */
public class LogggingExample3 {
    private static final Logger logger=Logger.getLogger(LogggingExample3.class.getName());
    public static void main(String[] args) {
       logger.log(Level.SEVERE,"Server ishlamayaptu degan xabar keladi");
       logger.log(Level.FINE,"Metod ishga tushdi");
       logger.log(Level.OFF,"Logging o'chirishga buyruq berildi");
    }
}
