package by.javatraining.gameroom.entity.toys;

import java.util.Objects;

public class Car extends Toy {

    private int numberWheels;

    public Car() {
        super("Car", "Plastic");
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

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "numberWheels=" + numberWheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberWheels == car.numberWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberWheels);
    }
}

