package by.epamtranning.action;

public class VowelDefinition {

    private static final String VOWEL = "aeiou";
    private static char[] arrVowel = new char[] {'a', 'e', 'i', 'o', 'u'};
    private static final String REGEX = "[aeiou]";

    public boolean isVowelFirstWay(char letter){
        return VOWEL.indexOf(letter) != -1;
    }

    public boolean isVowelSecondWay(char letter){
        return (letter == 'a' ||letter == 'e' || letter == 'i' ||
                letter == 'o' || letter == 'u');
    }

    public boolean isVowelThirdWay(char letter){
        for (char vowel : arrVowel){
            if (letter == vowel) {
                return true;
            }
        }
        return false;
    }

    public boolean isVowelFourthWay(char letter) {
        String inputLetter = String.valueOf(letter);
        return inputLetter.matches(REGEX);
    }
}
