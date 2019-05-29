package by.javatraining.gameroom.entity.toys;

public class Ball extends Toy {

    private String shape;

    public Ball() {
        super();
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
}
