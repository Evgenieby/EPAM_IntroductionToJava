package by.javatraining.gameroom.comparator;

import by.javatraining.gameroom.entity.toys.Toy;

import java.util.Comparator;

public class SizeComparator implements Comparator<Toy> {

    @Override
    public int compare(Toy o1, Toy o2) {
        return o1.getSize().compareTo(o2.getSize());
    }
}
