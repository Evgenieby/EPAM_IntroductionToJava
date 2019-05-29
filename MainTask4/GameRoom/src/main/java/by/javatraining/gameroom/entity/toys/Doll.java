package by.javatraining.gameroom.entity.toys;

public class Doll extends Toy {

    private String hairColor;
    private String clothes;

    public Doll() {
        super();
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
}
