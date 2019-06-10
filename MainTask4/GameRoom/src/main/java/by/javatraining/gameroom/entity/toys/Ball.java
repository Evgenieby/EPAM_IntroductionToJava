package by.javatraining.gameroom.entity.toys;

import java.util.Objects;

public class Ball extends Toy {

    private String shape;

    public Ball() {
        super("Ball", "rubber");
        this.shape = "circle";
    }

    public void jump() {
        System.out.println("Ball " + getToyName() + " is jumps.");
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Ball{" +
                super.toString() +
                "shape='" + shape + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ball ball = (Ball) o;
        return Objects.equals(shape, ball.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shape);
    }
}
