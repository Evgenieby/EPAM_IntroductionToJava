package by.javatraining.gameroom.creation;

import by.javatraining.gameroom.entity.toys.Toy;
import by.javatraining.gameroom.enums.TypeToy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ToyFactory {

    private static Logger log = LogManager.getLogger(ToyCreator.class);

    private ToyCreator toyCreator = new ToyCreator();

    /* Создание игрушки на основе массива данных. */
    public Toy createToy(String[] objectParameters) {
        TypeToy typeToy = TypeToy.valueOf(objectParameters[0].toUpperCase());

        switch (typeToy) {
            case CAR:
                return toyCreator.createCarToy(objectParameters);
            case DOLL:
                return toyCreator.createDollToy(objectParameters);
            case BALL:
                return toyCreator.createBallToy(objectParameters);
            case CUBES:
                return toyCreator.createCubesToy(objectParameters);
            default:
                log.error("Illegal className.");
                throw new EnumConstantNotPresentException(TypeToy.class, typeToy.name());
        }
    }
}
