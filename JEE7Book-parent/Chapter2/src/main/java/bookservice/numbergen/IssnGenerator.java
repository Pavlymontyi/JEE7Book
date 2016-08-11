package bookservice.numbergen;

import bookservice.logging.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

public class IssnGenerator implements NumberGenerator {

    @Inject
    private Logger logger;

    @Override
    @Loggable
    public String generateNumber() {
        String issn = "8-" + Math.abs(new Random().nextInt());
        logger.info("Сгенерирован ISBN : " + issn);
        return issn;
    }
}
