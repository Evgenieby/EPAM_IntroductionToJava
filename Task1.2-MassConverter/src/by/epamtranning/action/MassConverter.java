package by.epamtranning.action;

public class MassConverter {

    private static final int CONVERSION_RATE = 1000;

    public double convertToTonne(int mass){
        return (double)mass / CONVERSION_RATE;
    }

    public int convertToGramme(int mass){
        return mass * CONVERSION_RATE;
    }

    public int convertToMilligramme(int mass){
        return convertToGramme(mass) * CONVERSION_RATE;
    }
}
