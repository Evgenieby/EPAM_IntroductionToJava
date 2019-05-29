package by.javatraining.gameroom.validation;

public class RoomDataValidation {

    public boolean validateNameRoom(String parameter) {
        return (parameter != null);
    }

    public boolean validateMoneyLimit(String parameter) {
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
}
