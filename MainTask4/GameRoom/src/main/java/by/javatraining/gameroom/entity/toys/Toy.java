package by.javatraining.gameroom.entity.toys;

import by.javatraining.gameroom.enums.Age;
import by.javatraining.gameroom.enums.Size;

import java.util.Objects;

public abstract class Toy {

    private String toyName;
    private Age ageGroup;
    private String material;
    private Size size;
    private String color;
    private double cost;

/* Конструктор со значениями по умолчанию. */
    public Toy(String toyName, String material) {
        this.toyName = toyName;
        this.ageGroup = Age.GROUP_1;
        this.material = material;
        this.size = Size.MIDDLE;
        this.color = "multicolored";
        this.cost = 0.0;
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
        return "toyName='" + toyName + '\'' +
                ", ageGroup=" + ageGroup +
                ", material='" + material + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", cost=" + cost + ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Double.compare(toy.cost, cost) == 0 &&
                Objects.equals(toyName, toy.toyName) &&
                ageGroup == toy.ageGroup &&
                Objects.equals(material, toy.material) &&
                size == toy.size &&
                Objects.equals(color, toy.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toyName, ageGroup, material, size, color, cost);
    }
}
