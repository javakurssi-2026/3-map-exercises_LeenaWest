package part04;

import java.util.HashMap;
import java.util.Map;

/**
 * This is an extra class, which is not included in the grading of the
 * assignment. Feel free to complete this class or skip it entirely. If you
 * decide to complete it, you can use the MorseCodeTest class to test your
 * implementation. You can also create complete the MorseApp class, which uses
 * this class to translate between morse code and text.
 *
 * Based on Wikipedia, "Morse code is a method used in telecommunication to
 * encode text characters as standardized sequences of two different signal
 * durations, called dots and dashes, or dits and dahs"
 * (https://en.wikipedia.org/wiki/Morse_code).
 *
 * In this class, the morse code is represented as a string of dots (.) and
 * dashes (-). Characters are separated by a single space and words are
 * separated by three spaces.
 *
 * Your task is to implement the methods morseToText and textToMorse, which
 * translate between "normal" text and morse code. In the textToMorse method,
 * the input text can contain any characters, including special characters. You
 * only need to implement translation for the upper and lower case letters a-z
 * and the numbers 0-9.
 *
 * The mapping between characters and morse code can be found online, and is not
 * included in this assignment. You can use a Map to store the morse codes and
 * their corresponding characters.
 */
public class MorseCode {

    /**
     * Translates a string of morse code to text. The morse code is represented as
     * dots (.) and dashes (-). Characters are separated by a single space and words
     * are separated by three spaces. Characters a-z and 0-9 are supported.
     *
     * For example, ".... . .-.. .-.. --- .-- --- .-. .-.. -.." translates to
     * "hello world".
     *
     * @param morse the morse code to translate
     * @return the translated text (in lower case)
     */
    private final Map<Character, String> textToMorseMap = new HashMap<>();
    private final Map<String, Character> morseToTextMap = new HashMap<>();

    public MorseCode() {
        textToMorseMap.put('a', ".-");
        textToMorseMap.put('b', "-...");
        textToMorseMap.put('c', "-.-.");
        textToMorseMap.put('d', "-..");
        textToMorseMap.put('e', ".");
        textToMorseMap.put('f', "..-.");
        textToMorseMap.put('g', "--.");
        textToMorseMap.put('h', "....");
        textToMorseMap.put('i', "..");
        textToMorseMap.put('j', ".---");
        textToMorseMap.put('k', "-.-");
        textToMorseMap.put('l', ".-..");
        textToMorseMap.put('m', "--");
        textToMorseMap.put('n', "-.");
        textToMorseMap.put('o', "---");
        textToMorseMap.put('p', ".--.");
        textToMorseMap.put('q', "--.-");
        textToMorseMap.put('r', ".-.");
        textToMorseMap.put('s', "...");
        textToMorseMap.put('t', "-");
        textToMorseMap.put('u', "..-");
        textToMorseMap.put('v', "...-");
        textToMorseMap.put('w', ".--");
        textToMorseMap.put('x', "-..-");
        textToMorseMap.put('y', "-.--");
        textToMorseMap.put('z', "--..");

        textToMorseMap.put('0', "-----");
        textToMorseMap.put('1', ".----");
        textToMorseMap.put('2', "..---");
        textToMorseMap.put('3', "...--");
        textToMorseMap.put('4', "....-");
        textToMorseMap.put('5', ".....");
        textToMorseMap.put('6', "-....");
        textToMorseMap.put('7', "--...");
        textToMorseMap.put('8', "---..");
        textToMorseMap.put('9', "----.");

        for (Map.Entry<Character, String> entry : textToMorseMap.entrySet()) {
            morseToTextMap.put(entry.getValue(), entry.getKey());
        }
    }

    public String morseToText(String morse) {
        StringBuilder result = new StringBuilder();
        String[] words = morse.split(" {3}", -1);

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(" ");
            }

            if (words[i].isEmpty()) {
                continue;
            }

            String[] letters = words[i].split(" ");

            for (String letter : letters) {
                Character character = morseToTextMap.get(letter);

                if (character != null) {
                    result.append(character);
                }
            }
        }

        return result.toString();
    }

    /**
     * Translates a string of text to morse code. The morse code is represented as
     * dots (.) and dashes (-). Characters are separated by a single space and words
     * are separated by three spaces.
     *
     * Upper and lower case letters a-z and numbers 0-9 are supported. Other
     * characters are ignored.
     *
     * For example, "Hello World" translates to
     * ".... . .-.. .-.. --- .-- --- .-. .-.. -..".
     *
     * @param text the text to translate
     * @return the translated morse code as a single string
     */
    public String textToMorse(String text) {
        StringBuilder result = new StringBuilder();
        boolean previousWasLetter = false;

        for (int i = 0; i < text.length(); i++) {
            char character = Character.toLowerCase(text.charAt(i));

            if (character == ' ') {
                if (previousWasLetter) {
                    result.append("   ");
                    previousWasLetter = false;
                }
            } else {
                String morse = textToMorseMap.get(character);

                if (morse != null) {
                    if (result.length() > 0
                            && result.charAt(result.length() - 1) != ' ') {
                        result.append(" ");
                    } else if (result.length() > 0
                            && previousWasLetter) {
                        result.append(" ");
                    }

                    result.append(morse);
                    previousWasLetter = true;
                }
            }
        }

        return result.toString().trim();
    }
}
