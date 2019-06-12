package by.javatraining.gameroom.validation;

import by.javatraining.gameroom.enums.Age;
import by.javatraining.gameroom.enums.Size;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ToyDataValidation {

    private static Logger log = LogManager.getLogger(ToyDataValidation.class);

    public boolean validateNameToy(String parameter) {
        if(parameter == null || parameter.isEmpty()) {
            log.warn("Incorrect toy name");
            return false;
        }
        return true;
    }

    public boolean validateAgeGroupToy(String parameter) {
        if (parameter == null) {
            log.warn("Incorrect toy age-group");
            return false;
        }

        for (Age age : Age.values()) {
            if (age.name().equals(parameter.toUpperCase())) {
                return true;
            }
        }
        log.warn("Incorrect toy age-group: " + parameter);
        return false;
    }

    public boolean validateMaterialToy(String parameter) {
        if(parameter == null || parameter.isEmpty()) {
            log.warn("Incorrect toy material");
            return false;
        }
        return true;
    }

    public boolean validateSizeToy(String parameter) {
        if (parameter == null) {
            log.warn("Incorrect toy size");
            return false;
        }

        for (Size size : Size.values()) {
            if (size.name().equals(parameter.toUpperCase())) {
                return true;
            }
        }
        log.warn("Incorrect toy size: " + parameter);
        return false;
    }

    public boolean validateColorToy(String parameter) {
        if(parameter == null || parameter.isEmpty()) {
            log.warn("Incorrect toy color");
            return false;
        }
        return true;
    }

    public boolean validateCostToy(String parameter) {
        if (parameter == null) {
            log.warn("Incorrect toy cost");
            return false;
        }

        try {
            Double.parseDouble(parameter);
            return true;
        } catch (NumberFormatException e) {
            log.error("Incorrect toy cost: " + parameter);
            return false;
        }
    }

    public boolean validateNumberWheelsToy(String parameter) {
        if (parameter == null) {
            log.warn("Incorrect toy number wheels");
            return false;
        }

        try {
            Integer.parseInt(parameter);
            return true;
        } catch (NumberFormatException e) {
            log.error("Incorrect toy number wheels: " + parameter);
            return false;
        }
    }

    public boolean validateHairColorToy(String parameter) {
        if(parameter == null || parameter.isEmpty()) {
            log.warn("Incorrect toy hair color");
            return false;
        }
        return true;
    }

    public boolean validateClothesToy(String parameter) {
        if(parameter == null || parameter.isEmpty()) {
            log.warn("Incorrect toy clothes");
            return false;
        }
        return true;
    }

    public boolean validateShapeToy(String parameter) {
        if(parameter == null || parameter.isEmpty()) {
            log.warn("Incorrect toy shape");
            return false;
        }
        return true;
    }

    public boolean validatePictureToy(String parameter) {
        if(parameter == null || parameter.isEmpty()) {
            log.warn("Incorrect toy picture");
            return false;
        }
        return true;
    }
}
