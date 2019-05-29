package by.javatraining.gameroom.action;

import by.javatraining.gameroom.comparator.AgeGroupComparator;
import by.javatraining.gameroom.comparator.CostComparator;
import by.javatraining.gameroom.comparator.SizeComparator;
import by.javatraining.gameroom.storage.GameRoomStorage;

public class SortGameRoomToys {

    /* Сортировка игрушек по возрастной группе. */
    public static void sortToysByAgeGroup() {
        GameRoomStorage.getStorage().getToyList().sort(new AgeGroupComparator());
    }

    /* Сортировка игрушек по размеру и стоимости. */
    public static void sortToysBySizeAndCost() {
        GameRoomStorage.getStorage().getToyList().sort(new SizeComparator().thenComparing(new CostComparator()));
    }
}
