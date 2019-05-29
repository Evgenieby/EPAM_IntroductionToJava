package by.javatraining.gameroom.entity.rooms;

import by.javatraining.gameroom.entity.toys.Toy;
import by.javatraining.gameroom.storage.GameRoomStorage;

import java.util.List;

public class GameRoom {

    private String roomName;
    private List<Toy> toysList;
    private double moneyLimit;
    private double totalCostToys;

    public GameRoom() {
        this.toysList = GameRoomStorage.getStorage().getToyList();
        this.roomName = "Default room";
        this.moneyLimit = 480.8;
        this.totalCostToys = 0.0;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<Toy> getToysList() {
        return toysList;
    }

    public void setToysList(List<Toy> toysList) {
        this.toysList = toysList;
    }

    public double getMoneyLimit() {
        return moneyLimit;
    }

    public void setMoneyLimit(double moneyLimit) {
        this.moneyLimit = moneyLimit;
    }

    public double getTotalCostToys() {
        return totalCostToys;
    }

    public void setTotalCostToys(double totalCostToys) {
        this.totalCostToys = totalCostToys;
    }

    @Override
    public String toString() {
        return "GameRoom{" +
                "roomName='" + roomName + '\'' +
                ", toysList=" + toysList +
                ", moneyLimit=" + moneyLimit +
                ", totalCostToys=" + totalCostToys +
                '}';
    }
}
