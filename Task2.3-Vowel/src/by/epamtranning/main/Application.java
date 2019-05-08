package by.epamtranning.main;

import by.epamtranning.action.VowelDefinition;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();
        System.out.println("Enter letter:");
        char inputLetter = Character.toLowerCase(reader.readChar());
        VowelDefinition vowelDefinition = new VowelDefinition();

        System.out.println("The letter is: ");
        if (vowelDefinition.isVowelFirstWay(inputLetter)){
            System.out.println("first method - vowel");
        }

        if (vowelDefinition.isVowelSecondWay(inputLetter)){
            System.out.println("second method - vowel");
        }

        if (vowelDefinition.isVowelThirdWay(inputLetter)){
            System.out.println("third method - vowel");
        }

        if (vowelDefinition.isVowelFourthWay(inputLetter)){
            System.out.println("fourth method - vowel");
        }
    }
}
