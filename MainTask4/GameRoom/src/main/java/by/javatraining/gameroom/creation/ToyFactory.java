package by.javatraining.gameroom.creation;

import by.javatraining.gameroom.entity.toys.Toy;
import by.javatraining.gameroom.exception.IncorrectClassNameException;

public class ToyFactory {

    private ToyCreator toyCreator = new ToyCreator();

    /* Создание игрушки на основе массива данных. */
    public Toy createToy(String[] objectParameters) throws IncorrectClassNameException {
        String classToy = objectParameters[0].toUpperCase();

        switch (classToy) {
            case "CAR":
                return toyCreator.createCarToy(objectParameters);
            case "DOLL":
                return toyCreator.createDollToy(objectParameters);
            case "BALL":
                return toyCreator.createBallToy(objectParameters);
            case "CUBES":
                return toyCreator.createCubesToy(objectParameters);
            default:
                throw new IncorrectClassNameException("Incorrect toy class name: " + classToy);
        }
    }
}
