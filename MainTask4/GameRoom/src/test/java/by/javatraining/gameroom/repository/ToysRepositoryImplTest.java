package by.javatraining.gameroom.repository;

import by.javatraining.gameroom.entity.toys.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ToysRepositoryImplTest {

    private Toy toy;
    private Toy toy1;
    private Toy toy2;
    private Toy toy3;
    private ToysRepositoryImpl repository;

    @Before
    public void setUp() {
        toy = new Car();
        toy1 = new Ball();
        toy2 = new Doll();
        toy3 = new Cubes();
        repository = new ToysRepositoryImpl();
        repository.save(toy);
        repository.save(toy1);
        repository.save(toy2);
        repository.save(toy3);
    }

    @Test
    public void findAll() {
        List<Toy> expected = repository.findAll();
        List<Toy> actual = new ArrayList<>();
        actual.add(toy);
        actual.add(toy1);
        actual.add(toy2);
        actual.add(toy3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findToysBySize() {
        List<Toy> expected = repository.findToysBySize("middle");
        List<Toy> actual = new ArrayList<>();
        actual.add(toy);
        actual.add(toy1);
        actual.add(toy2);
        actual.add(toy3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findToysByAgeGroup() {
        List<Toy> expected = repository.findToysByAgeGroup("group_1");
        List<Toy> actual = new ArrayList<>();
        actual.add(toy);
        actual.add(toy1);
        actual.add(toy2);
        actual.add(toy3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findToysByMaterialAndCost() {
        List<Toy> expected = repository.findToysByMaterialAndCost("Plastic", 0.0);
        List<Toy> actual = new ArrayList<>();
        actual.add(toy);
        actual.add(toy2);

        Assert.assertEquals(expected, actual);
    }
}