package by.javatraining.gameroom.entity.toys;

public class Cubes extends Toy {

    private String picture;

    public Cubes() {
        super();
        this.picture = "numbers";
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
