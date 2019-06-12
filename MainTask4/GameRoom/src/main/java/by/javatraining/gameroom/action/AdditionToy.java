package by.javatraining.gameroom.action;

import by.javatraining.gameroom.creation.ToyFactory;
import by.javatraining.gameroom.entity.rooms.GameRoom;
import by.javatraining.gameroom.entity.toys.Toy;
import by.javatraining.gameroom.exception.IncorrectClassNameException;
import by.javatraining.gameroom.repository.ToysRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class AdditionToy {

    private static Logger log = LogManager.getLogger(AdditionToy.class);

    private static final String SEPARATOR_REGEX = "[,|!]";
    private ToyFactory toyFactory = new ToyFactory();
    private GameRoom gameRoom;
    private ToysRepository toysRepository;

    public AdditionToy(GameRoom gameRoom, ToysRepository toysRepository) {
        this.gameRoom = gameRoom;
        this.toysRepository = toysRepository;
    }

    /* Добавление игрушки в комнату. */
    public void addToyToRoom(List<String> stringList) {
        for (String line : stringList) {
            String[] objectParameters = line.split(SEPARATOR_REGEX);
            Toy toy;

            try {
                toy = toyFactory.createToy(objectParameters);
            } catch (IncorrectClassNameException e) {
                log.error(e.getMessage());
                continue;
            }

            if (isInMoneyLimit(toy)) {
                toysRepository.save(toy);
                gameRoom.setTotalCostToys(gameRoom.getTotalCostToys() + toy.getCost()); // Увеличение общей стоимости игрушек
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
            return true;
        }
        log.warn("Cash limit exceeded");
        return false;
    }
}
