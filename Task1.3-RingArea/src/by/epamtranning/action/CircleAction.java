package by.epamtranning.action;

public class CircleAction {

    public double calcSquareOfCircle(int radius){
        int exponent = 2;
        return Math.PI * Math.pow(radius, exponent);
    }

    public double calcSquareOfRing(int outerRadius, int innerRadius){
        return calcSquareOfCircle(outerRadius) - calcSquareOfCircle(innerRadius);
    }
}
