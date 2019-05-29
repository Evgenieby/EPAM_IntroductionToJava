package by.javatraining.gameroom.comparator;

import by.javatraining.gameroom.entity.toys.Toy;

import java.util.Comparator;

public class CostComparator implements Comparator<Toy> {

    @Override
    public int compare(Toy o1, Toy o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
