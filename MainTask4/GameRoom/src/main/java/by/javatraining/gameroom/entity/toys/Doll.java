package by.javatraining.gameroom.entity.toys;

import java.util.Objects;

public class Doll extends Toy {

    private String hairColor;
    private String clothes;

    public Doll() {
        super("Doll", "Plastic");
        this.hairColor = "black";
        this.clothes = "dress";
    }

    public void speak() {
        System.out.println("The doll says 'hi'");
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Doll{" +
                super.toString() +
                "hairColor='" + hairColor + '\'' +
                ", clothes='" + clothes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doll doll = (Doll) o;
        return Objects.equals(hairColor, doll.hairColor) &&
                Objects.equals(clothes, doll.clothes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hairColor, clothes);
    }
}
