package by.javatraining.gameroom.entity.toys;

import java.util.Objects;

public class Cubes extends Toy {

    private String pictureOnSides;

    public Cubes() {
        super("Cubes", "Wood");
        this.pictureOnSides = "numbers";
    }

    public void connect() {
        System.out.println("Cubes are connecting");
    }

    public String getPictureOnSides() {
        return pictureOnSides;
    }

    public void setPictureOnSides(String pictureOnSides) {
        this.pictureOnSides = pictureOnSides;
    }

    @Override
    public String toString() {
        return "Cubes{" +
                super.toString() +
                "pictureOnSides='" + pictureOnSides + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cubes cubes = (Cubes) o;
        return Objects.equals(pictureOnSides, cubes.pictureOnSides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pictureOnSides);
    }
}
