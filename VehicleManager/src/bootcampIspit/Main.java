package bootcampIspit;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * Program za upravljanje flotom vozila.
 *
 * @author filip
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) throws IOException, Greska {
        Logger logger = Logger.getLogger(Izbornik.class.getName());
        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
        } catch( IOException e) {
            logger.warning("Log datoteka se nije uspjela kreirati!");
        }

        Izbornik izbornik = new Izbornik();
        izbornik.pokreniAplikaciju();

}
}