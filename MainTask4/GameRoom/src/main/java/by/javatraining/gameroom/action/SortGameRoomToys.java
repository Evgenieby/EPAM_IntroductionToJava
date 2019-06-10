package by.javatraining.gameroom.action;

import by.javatraining.gameroom.comparator.AgeGroupComparator;
import by.javatraining.gameroom.comparator.CostComparator;
import by.javatraining.gameroom.comparator.SizeComparator;
import by.javatraining.gameroom.entity.rooms.GameRoom;

public class SortGameRoomToys {

    public static void sortToysByAgeGroup(GameRoom room) {
        room.getToysList().sort(new AgeGroupComparator());
    }

    public static void sortToysBySizeAndCost(GameRoom room) {
        room.getToysList().sort(new SizeComparator().thenComparing(new CostComparator()));
    }
}
