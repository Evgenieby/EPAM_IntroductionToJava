package by.javatraining.gameroom.storage;

import by.javatraining.gameroom.entity.toys.Toy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/* Имитация базы данных. */
public class GameRoomStorage {

    private static Logger log = LogManager.getLogger(GameRoomStorage.class);

    /* Переменная, которая хранит ссылку на единственный экземпляр объекта класса GameRoomStorage. */
    private static final GameRoomStorage STORAGE;

    /* Список игрушек в комнате. */
    private List<Toy> toyList;

    static {
        STORAGE = new GameRoomStorage();
        log.info("Storage created.");
    }

    private GameRoomStorage() {
        this.toyList = new ArrayList<>();
    }

    public static GameRoomStorage getStorage() {
        return STORAGE;
    }

    public List<Toy> getToyList() {
        return toyList;
    }
}
