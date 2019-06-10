package by.javatraining.gameroom.validation;

import by.javatraining.gameroom.enums.Age;
import by.javatraining.gameroom.enums.Size;

public class ToyDataValidation {

    public boolean validateNameToy(String parameter) {
        return (parameter != null);
    }

    public boolean validateAgeToy(String parameter) {
        if (parameter == null) {
            return false;
        }

        for (Age age : Age.values()) {
            if (age.name().equals(parameter.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    public boolean validateMaterialToy(String parameter) {
        return (parameter != null);
    }

    public boolean validateSizeToy(String parameter) {
        if (parameter == null) {
            return false;
        }

        for (Size size : Size.values()) {
            if (size.name().equals(parameter.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    public boolean validateColorToy(String parameter) {
        return (parameter != null);
    }

    public boolean validateCostToy(String parameter) {
        if (parameter == null) {
            return false;
        }

        try {
            Double.parseDouble(parameter);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validateNumberWheelsToy(String parameter) {
        if (parameter == null) {
            return false;
        }

        try {
            Integer.parseInt(parameter);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validateHairColorToy(String parameter) {
        return (parameter != null);
    }

    public boolean validateClothesToy(String parameter) {
        return (parameter != null);
    }

    public boolean validateShapeToy(String parameter) {
        return (parameter != null);
    }

    public boolean validatePictureToy(String parameter) {
        return (parameter != null);
    }
}
