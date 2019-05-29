package by.javatraining.gameroom.entity.toys;

public class Car extends Toy {

    private int numberWheels;

    public Car() {
        super();
        this.numberWheels = 4; // Количество колёс по умолчанию
    }

    public void beep() {
        System.out.println("Car " + getToyName() + " is beeping.");
    }

    public void move() {
        System.out.println("Car " + getToyName() + " is moving.");
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }
}

