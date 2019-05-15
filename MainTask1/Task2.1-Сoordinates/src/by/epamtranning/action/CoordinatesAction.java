package by.epamtranning.action;

public class CoordinatesAction {

    public boolean isPointOnOneLine(int xA, int yA, int xB, int yB, int xC, int yC) {
        return  ((xA - xC) * (yB - yC)) == ((xB - xC) * (yA - yC));
    }

    public boolean isRightTriangle(int xA, int yA, int xB, int yB, int xC, int yC) {
        if(!isPointOnOneLine(xA, yA, xB, yB, xC, yC)) {
            double sqAB = Math.pow(getLengthBetweenPoint(xA, yA, xB, yB), 2);
            double sqBC = Math.pow(getLengthBetweenPoint(xB, yB, xC, yC), 2);
            double sqAC = Math.pow(getLengthBetweenPoint(xA, yA, xC, yC), 2);

            return ((sqAB == sqAC + sqBC) || (sqAC == sqAB + sqBC) || (sqBC == sqAB + sqAC));
        }
        return false;
    }

    public double getLengthBetweenPoint(int x1, int y1, int x2, int y2) {
        return (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }
}
