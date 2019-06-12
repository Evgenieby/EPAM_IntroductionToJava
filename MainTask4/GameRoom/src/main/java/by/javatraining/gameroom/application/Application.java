package by.javatraining.gameroom.application;

import by.javatraining.gameroom.action.AdditionToy;
import by.javatraining.gameroom.action.SortGameRoomToys;
import by.javatraining.gameroom.creation.RoomCreator;
import by.javatraining.gameroom.entity.rooms.GameRoom;
import by.javatraining.gameroom.entity.toys.Toy;
import by.javatraining.gameroom.exception.DataFileReaderException;
import by.javatraining.gameroom.reader.DataReaderFromFile;
import by.javatraining.gameroom.repository.ToysRepository;
import by.javatraining.gameroom.repository.ToysRepositoryImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Application {

    private static Logger log = LogManager.getLogger(Application.class);

    private final static String DATA_TOY_FILE_NAME = "data/init_toy_data.txt";
    private final static String DATA_ROOM_FILE_NAME = "data/init_room_data.txt";

    public static void main(String[] args) {
        Application application = new Application();
        try {
            application.beginApp();
        } catch (DataFileReaderException e) {
            log.error(e.getMessage());
        }
    }

    private void beginApp() throws DataFileReaderException {
        DataReaderFromFile reader = new DataReaderFromFile();

        /* Создание игровой комнаты. */
        GameRoom gameRoom = RoomCreator.createRoom(reader.readFile(DATA_ROOM_FILE_NAME));

        /* Добавляем игрушки из файла. */
        AdditionToy roomAction = new AdditionToy(gameRoom, new ToysRepositoryImpl());
        roomAction.addToyToRoom(reader.readFile(DATA_TOY_FILE_NAME));
        printToysList(gameRoom.getToysList());

        /* Сортировка игрушек в комнате по возрастным группам. */
        SortGameRoomToys.sortToysByAgeGroup(gameRoom);
        printToysList(gameRoom.getToysList());

        /* Сортировка игрушек в комнате по размеру и стоимости. */
        SortGameRoomToys.sortToysBySizeAndCost(gameRoom);
        printToysList(gameRoom.getToysList());

        /* Поиск игрушек по размеру. */
        String size = "Middle";
        ToysRepository repository = new ToysRepositoryImpl();
        List<Toy> toyList = repository.findToysBySize(size);

        if (!toyList.isEmpty()) {
            printToysList(toyList);
        } else {
            log.info("Toys with size " + size + " not found");
        }
    }

     private void printToysList(List<Toy> toyList) {
         for (Toy toy : toyList) {
             System.out.println(toy.toString());
         }
         System.out.println();
     }
}
