package utils;

import models.Song;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * NOTE: This UserHelperMethods class is already complete no changes are needed
 * These are helper method used by the MP3 Player but aren't specific to that class. Most of these methods could easily be reused in a different program
 */
public class UserHelperMethods {
    /**
     * Prints the given array to the console
     * @param array The array to be printed
     */
    public static void printArray(String[] array) {
        // For each element in the array print the index and the element
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    /**
     * Prints the given map to the console
     * @param map The map to be printed
     */
    public static void printMap(Map<String, List<Song>> map) {
        // Prints out each key value pair
        for (String key : map.keySet()) {
            System.out.println("- " + key);
            printSongs(map.get(key));
        }

    }

    /**
     * Prints the given list of songs to the console
     * @param songs The list of songs
     */
    public static void printSongs(List<Song> songs) {
        // For each song in the list print the index and the song
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(i + ". " + songs.get(i));
        }
    }

    /**
     * Prints the given options to the console and prompts the user
     * @param options The list of options
     */
    public static void printOptions(String[] options) {
        printArray(options);
        System.out.println("Enter the number of your selected option:");
    }

    /**
     * Displays the options and waits for the user to enter a valid options
     * @param options The array of options
     * @return The index of the selected option
     */
    public static int displayOptionsAndWaitForValidOption(String[] options) {
        // Initializes the scanner and defaults the option variable
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        // Prints the options
        printOptions(options);

        // An infinite to ensure the user selects a valid option
        do {
            // Reads the user input
            String input = scanner.nextLine();

            // Tries to parse the input to an integer
            try {
                option = Integer.parseInt(input);

                // If the option if not negative or outside the scope of the options, return that option as it is valid and ends the loop
                if (option >= 0 && option <= options.length) {
                    return option;
                }

                // Prints the options again as the input was not valid
                printOptions(options);
            } catch(NumberFormatException e) {
                // Catches any parsing error and re-prompts the user
                printOptions(options);
            }
        } while (true);
    }

    /**
     * Displays the song options and waits for the user to enter a valid options
     * @param songOptions The list of song options
     * @return The index of the selected song option
     */
    public static int displayOptionsAndWaitForValidOption(List<Song> songOptions) {
        // Creates an array of all the song text
        String[] songText = new String[songOptions.size()];

        // Fills the sonText array with the string versions of each song
        for (int i = 0; i < songOptions.size(); i++) {
            songText[i] = songOptions.get(i).toString();
        }

        // Calls the other displayOptionsAndWaitForValidOption method now that the data type is correct
        return displayOptionsAndWaitForValidOption(songText);
    }

    /**
     * Gets the string input from a prompt
     * @param prompt The prompt for the user
     * @return The entered text from the prompt
     */
    public static String getInputFromPrompt(String prompt) {
        // Initializes the scanner
        Scanner scanner = new Scanner(System.in);

        // Displays the prompts and gets the user input
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
