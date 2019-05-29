package by.javatraining.gameroom.reader;

import by.javatraining.gameroom.exception.DataFileReaderException;
import by.javatraining.gameroom.validation.FileValidation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReaderFromFile {

    private static Logger log = LogManager.getLogger(DataReaderFromFile.class);

    public List<String> readFile(String dataFileName) throws DataFileReaderException {
        List <String> stringList = new ArrayList<>();
        File file = new File(dataFileName);
        FileValidation fileValidation = new FileValidation();

        if (!fileValidation.validateFile(file)) {
            log.error("Error: incorrect file" + file);
            throw new DataFileReaderException("Incorrect file: " + file);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String dataLine;

            while ((dataLine = bufferedReader.readLine()) != null) {
                stringList.add(dataLine);
            }
        } catch (IOException e) {
            throw new DataFileReaderException(e);
        }
        return stringList;
    }
}