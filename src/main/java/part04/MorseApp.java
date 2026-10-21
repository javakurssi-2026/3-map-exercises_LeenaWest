package part04;

import java.util.Scanner;

public class MorseApp {

    public static void main(String... args) {
        MorseCode morseCode = new MorseCode();
        Scanner input = new Scanner(System.in);

        System.out.println("Morse Code Translator");
        System.out.println("1 - Text to Morse");
        System.out.println("2 - Morse to Text");
        System.out.print("Choose translation (1 or 2): ");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            System.out.print("Enter text: ");
            String text = input.nextLine();

            String morse = morseCode.textToMorse(text);
            System.out.println("Morse code: " + morse);

        } else if (choice.equals("2")) {
            System.out.print("Enter Morse code: ");
            String morse = input.nextLine();

            String text = morseCode.morseToText(morse);
            System.out.println("Text: " + text);

        } else {
            System.out.println("Invalid choice.");
        }

        input.close();
    }
}
