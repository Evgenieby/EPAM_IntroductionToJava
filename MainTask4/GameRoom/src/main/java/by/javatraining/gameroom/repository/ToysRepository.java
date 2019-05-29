package by.javatraining.gameroom.repository;

import by.javatraining.gameroom.entity.toys.Toy;

import java.util.List;

public interface ToysRepository {

    void save(Toy toy);
    List<Toy> findAll();
    List<Toy> findToysBySize(String size);
    List<Toy> findToysByAgeGroup(String ageGroup);
    List<Toy> findToysByMaterialAndCost(String material, double cost);
}
