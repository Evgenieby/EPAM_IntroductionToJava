package by.javatraining.gameroom.validation;

import java.io.File;

public class FileValidation {

    public boolean validateFile(File file) {
        return ((file != null) && file.exists() && (file.length() != 0));
    }
}
