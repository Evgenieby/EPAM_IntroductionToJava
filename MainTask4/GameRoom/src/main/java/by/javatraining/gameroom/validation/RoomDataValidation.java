package by.javatraining.gameroom.validation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RoomDataValidation {

    private static Logger log = LogManager.getLogger(ToyDataValidation.class);

    public boolean validateNameRoom(String parameter) {
        if(parameter == null || parameter.isEmpty()) {
            log.warn("Incorrect room name");
            return false;
        }
        return true;
    }

    public boolean validateMoneyLimit(String parameter) {
        if (parameter == null) {
            log.warn("Incorrect money limit");
            return false;
        }

        try {
            Double.parseDouble(parameter);
            return true;
        } catch (NumberFormatException e) {
            log.error("Incorrect money limit:" + parameter);
            return false;
        }
    }
}
