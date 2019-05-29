package by.javatraining.gameroom.entity.toys;

import by.javatraining.gameroom.enums.Age;
import by.javatraining.gameroom.enums.Size;

public abstract class Toy {

    private String toyName;
    private Age ageGroup;
    private String material;
    private Size size;
    private String color;
    private double cost;

/* Конструктор со значениями по умолчанию. */
    public Toy() {
        this.toyName = "Toy";
        this.ageGroup = Age.GROUP_1;
        this.material = "Plastic";
        this.size = Size.MIDDLE;
        this.color = "multicolored";
        this.cost = 10.0;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public Age getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(Age ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyName='" + toyName + '\'' +
                ", ageGroup=" + ageGroup +
                ", material='" + material + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
