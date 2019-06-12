package by.javatraining.gameroom.creation;

import by.javatraining.gameroom.entity.rooms.GameRoom;
import by.javatraining.gameroom.validation.RoomDataValidation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class RoomCreator {

    private static Logger log = LogManager.getLogger(RoomCreator.class);

    private static final String SEPARATOR_REGEX = "[ ,|!]";

    public static GameRoom createRoom(List<String> stringList) {
        RoomDataValidation dataValidation = new RoomDataValidation();
        GameRoom gameRoom = new GameRoom();

        for (String line : stringList) {
            String[] objectParameters = line.split(SEPARATOR_REGEX);

            if (objectParameters.length > 0 && dataValidation.validateNameRoom(objectParameters[0])) {
                gameRoom.setRoomName(objectParameters[0]);
            }

            if (objectParameters.length > 1 && dataValidation.validateMoneyLimit(objectParameters[1])) {
                gameRoom.setMoneyLimit(Double.parseDouble(objectParameters[1]));
            }

            log.info("Room successfully created: " + gameRoom.getRoomName());
        }
        return gameRoom;
    }
}
