package by.javatraining.gameroom.repository;

import by.javatraining.gameroom.entity.toys.Toy;
import by.javatraining.gameroom.enums.Age;
import by.javatraining.gameroom.enums.Size;
import by.javatraining.gameroom.storage.GameRoomStorage;

import java.util.ArrayList;
import java.util.List;

public class ToysRepositoryImpl implements ToysRepository {

    private GameRoomStorage storage = GameRoomStorage.getStorage();

    @Override
    public void save(Toy toy) {
        storage.getToyList().add(toy);
    }

    @Override
    public List<Toy> findAll() {
        return storage.getToyList();
    }

    @Override
    public List<Toy> findToysBySize(String size) {
        List<Toy> toyList = storage.getToyList();
        List<Toy> resultToyList = new ArrayList<>();

        for (Toy toy : toyList)
            if (toy.getSize().equals(Size.valueOf(size.toUpperCase()))) {
                resultToyList.add(toy);
            }
        return resultToyList;
    }

    @Override
    public List<Toy> findToysByAgeGroup(String ageGroup) {
        List<Toy> toyList = storage.getToyList();
        List<Toy> resultToyList = new ArrayList<>();

        for (Toy toy : toyList)
            if (toy.getAgeGroup().equals(Age.valueOf(ageGroup))) {
                resultToyList.add(toy);
            }
        return resultToyList;
    }

    @Override
    public List<Toy> findToysByMaterialAndCost(String material, double maxCost) {
        List<Toy> toyList = storage.getToyList();
        List<Toy> resultToyList = new ArrayList<>();

        for (Toy toy : toyList)
            if (toy.getMaterial().equals(material) && (toy.getCost() < maxCost)) {
                resultToyList.add(toy);
            }
        return resultToyList;
    }
}
