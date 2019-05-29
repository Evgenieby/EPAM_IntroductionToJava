package by.javatraining.gameroom.application;

import by.javatraining.gameroom.action.AdditionToy;
import by.javatraining.gameroom.creation.RoomCreator;
import by.javatraining.gameroom.entity.rooms.GameRoom;
import by.javatraining.gameroom.entity.toys.Toy;
import by.javatraining.gameroom.exception.DataFileReaderException;
import by.javatraining.gameroom.reader.DataReaderFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        AdditionToy roomAction = new AdditionToy(gameRoom);
        roomAction.addToyToRoom(reader.readFile(DATA_TOY_FILE_NAME));

        for (Toy toy : gameRoom.getToysList()) {
            System.out.println(toy.toString());
        }
    }
}
