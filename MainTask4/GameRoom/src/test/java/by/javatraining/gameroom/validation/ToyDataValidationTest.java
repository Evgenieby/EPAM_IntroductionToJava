package by.javatraining.gameroom.validation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ToyDataValidationTest {

    private ToyDataValidation validation;

    @Before
    public void setUp() {
        validation = new ToyDataValidation();
    }

    @Test
    public void validateNameToy() {
        boolean expected = validation.validateNameToy("Ball");

        Assert.assertTrue(expected);
    }

    @Test
    public void validateAgeToy() {
        boolean expected = validation.validateAgeGroupToy("group_4");

        Assert.assertTrue(expected);
    }

    @Test
    public void validateMaterialToy() {
        boolean expected = validation.validateMaterialToy("wood");

        Assert.assertTrue(expected);
    }

    @Test
    public void validateSizeToy() {
        boolean expected = validation.validateSizeToy("small");

        Assert.assertTrue(expected);
    }

    @Test
    public void validateColorToy() {
        boolean expected = validation.validateColorToy("green");

        Assert.assertTrue(expected);
    }

    @Test
    public void validateCostToy() {
        boolean expected = validation.validateCostToy("23.7");

        Assert.assertTrue(expected);
    }

    @Test
    public void validateNumberWheelsToy() {
        boolean expected = validation.validateNumberWheelsToy("3");

        Assert.assertTrue(expected);
    }

    @Test
    public void validateHairColorToy() {
        boolean expected = validation.validateHairColorToy("black");

        Assert.assertTrue(expected);
    }

    @Test
    public void validateClothesToy() {
        boolean expected = validation.validateClothesToy("jeans");

        Assert.assertTrue(expected);
    }

    @Test
    public void validateShapeToy() {
        boolean expected = validation.validateShapeToy("oval");

        Assert.assertTrue(expected);
    }

    @Test
    public void validatePictureToy() {
        boolean expected = validation.validatePictureToy("animals");

        Assert.assertTrue(expected);
    }
}