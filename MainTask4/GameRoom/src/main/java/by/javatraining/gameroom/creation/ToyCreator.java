package by.javatraining.gameroom.creation;

import by.javatraining.gameroom.entity.toys.*;
import by.javatraining.gameroom.enums.Age;
import by.javatraining.gameroom.enums.Size;
import by.javatraining.gameroom.validation.ToyDataValidation;

public class ToyCreator {

    private ToyDataValidation dataValidation = new ToyDataValidation();

    public Car createCarToy(String[] objectParameters) {
        Car carToy = new Car();
        initializeToy(carToy, objectParameters);

        if (objectParameters.length > 7 && dataValidation.validateNumberWheelsToy(objectParameters[7])) {
            carToy.setNumberWheels(Integer.parseInt(objectParameters[7]));
        }
        return carToy;
    }

    public Doll createDollToy(String[] objectParameters) {
        Doll dollToy = new Doll();
        initializeToy(dollToy, objectParameters);

        if (objectParameters.length > 7 && dataValidation.validateHairColorToy(objectParameters[7])) {
            dollToy.setHairColor(objectParameters[7]);
        }

        if (objectParameters.length > 8 && dataValidation.validateClothesToy(objectParameters[8])) {
            dollToy.setClothes(objectParameters[8]);
        }

        return dollToy;
    }

    public Ball createBallToy(String[] objectParameters) {
        Ball ballToy = new Ball();
        initializeToy(ballToy, objectParameters);

        if (objectParameters.length > 7 && dataValidation.validateShapeToy(objectParameters[7])) {
            ballToy.setShape(objectParameters[7]);
        }

        return ballToy;
    }

    public Cubes createCubesToy(String[] objectParameters) {
        Cubes cubesToy = new Cubes();
        initializeToy(cubesToy,objectParameters);

        if (objectParameters.length > 7 && dataValidation.validatePictureToy(objectParameters[7])) {
            cubesToy.setPicture(objectParameters[7]);
        }

        return cubesToy;
    }

    /* Иницилизация общих параметров для всех игрушек. */
    private void initializeToy(Toy toy, String[] objectParameters) {
        if (objectParameters.length > 1 && dataValidation.validateNameToy(objectParameters[1])) {
            toy.setToyName(objectParameters[1]);
        }

        if (objectParameters.length > 2 && dataValidation.validateAgeToy(objectParameters[2].toUpperCase())) {
            toy.setAgeGroup(Age.valueOf(objectParameters[2].toUpperCase()));
        }

        if (objectParameters.length > 3 && dataValidation.validateMaterialToy(objectParameters[3])) {
            toy.setMaterial(objectParameters[3]);
        }

        if (objectParameters.length > 4 && dataValidation.validateSizeToy(objectParameters[4].toUpperCase())) {
            toy.setSize(Size.valueOf(objectParameters[4].toUpperCase()));
        }

        if (objectParameters.length > 5 && dataValidation.validateColorToy(objectParameters[5])) {
            toy.setColor(objectParameters[5]);
        }

        if (objectParameters.length > 6 && dataValidation.validateCostToy(objectParameters[6])) {
            toy.setCost(Double.parseDouble(objectParameters[6]));
        }
    }
}
