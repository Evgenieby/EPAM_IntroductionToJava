package by.javatraining.gameroom.action;

import by.javatraining.gameroom.creation.ToyFactory;
import by.javatraining.gameroom.entity.rooms.GameRoom;
import by.javatraining.gameroom.entity.toys.Toy;
import by.javatraining.gameroom.repository.ToysRepositoryImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class AdditionToy {

    private static Logger log = LogManager.getLogger(AdditionToy.class);

    private GameRoom gameRoom;
    private static final String REGEX = "[, ]+";
    private ToyFactory toyFactory = new ToyFactory();
    private ToysRepositoryImpl toysRepository = new ToysRepositoryImpl();

    public AdditionToy(GameRoom gameRoom) {
        this.gameRoom = gameRoom;
    }

    public void addToyToRoom(List<String> stringList) {
        for (String line : stringList) {
            String[] objectParameters = line.split(REGEX);
            Toy toy = toyFactory.createToy(objectParameters);

            if (isInMoneyLimit(toy)) {
                toysRepository.save(toy);
                log.info("Toy successfully added: " + toy.getToyName());
            }
        }
    }

    /* Проверка на превышение установленного денежного лимита. */
    private boolean isInMoneyLimit(Toy toy) {
        double totalCostToys = gameRoom.getTotalCostToys();
        double moneyLimit = gameRoom.getMoneyLimit();
        double tempTotalCost = totalCostToys + toy.getCost();

       if (tempTotalCost <= moneyLimit) {
           gameRoom.setTotalCostToys(tempTotalCost); // Увеличение общей стоимости игрушек
           return true;
       }
       return false;
    }
}
