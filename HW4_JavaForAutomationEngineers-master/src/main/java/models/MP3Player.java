package models;

import resources.OptionStrings;
import utils.UserHelperMethods;
import java.util.*;

/**
 * NOTE: This MP3Player class is already complete no changes are needed
 * This is a console application for an MP3 Player
 * TODO FOR HOMEWORK: Run this application and try many work flows, most of the short answer questions will be on this class
 */
public class MP3Player {
    /**
     * The song database instance
     */
    private SongDatabase songDatabase;

    /**
     * The reference to the currently playing song
     */
    private Song currentlyPlaying;

    /**
     * The song queue for songs to be played
     * A Queue is a first-in first-out (FIFO) collection and more information can be found here: https://everythingcomputerscience.com/discrete_mathematics/Stacks_and_Queues.html
     */
    private List<Song> songQueue;

    /**
     * The scanner reference to read input from the user
     */
    private Scanner scanner;

    /**
     * Creates an instance of the MP3Player class
     */
    public MP3Player() {
        // Creates a new SongDatabase
        this.songDatabase = new SongDatabase();
        // Sets the currentlyPlaying song to null
        currentlyPlaying = null;
        // Sets the songQueue to an empty list
        songQueue = new ArrayList<Song>();
        // Sets the scanner to listing to System.in
        this.scanner = new Scanner(System.in);
    }

    /**
     * Gets the Song Database
     * @return The song database
     */
    public SongDatabase getSongDatabase() {
        return songDatabase;
    }

    /**
     * Sets the Song database
     * @param songDatabase The new song database
     */
    protected void setSongDatabase(SongDatabase songDatabase) {
        this.songDatabase = songDatabase;
    }

    /**
     * Displays the main menu and handles the user choice
     */
    private void mainMenu() {
        // Displays the main menu options and deceivers the users choice
        int userChoice = UserHelperMethods.displayOptionsAndWaitForValidOption(OptionStrings.MAIN_MENU_OPTIONS);
        String userChoiceText = OptionStrings.MAIN_MENU_OPTIONS[userChoice];

        // Checks for each of the options and handles accordingly
        if (userChoiceText.equals("Play")) {
            // Navigates the user of to the 'Play' menu
            playMenu();
        } else if (userChoiceText.equals("Manage Playlists")) {
            // Navigates the user of to the 'Manage Playlists' menu
            managePlaylistsMenu();
        } else if (userChoiceText.equals("Manage Songs")) {
            // Navigates the user of to the 'Manage Songs' menu
            manageSongsMenu();
        } else {
            // Ends the program
            System.out.println("ENDING PROGRAM...");
            System.out.println("Thank you for using this MP3 Player!");
        }
    }

    /**
     * Displays the play menu and handles the user choice
     */
    private void playMenu() {
        // Displays the play menu options and deceivers the users choice
        int userChoice = UserHelperMethods.displayOptionsAndWaitForValidOption(OptionStrings.PLAY_OPTIONS);
        String userChoiceText = OptionStrings.PLAY_OPTIONS[userChoice];

        // Checks for each of the options and handles accordingly
        if (userChoiceText.equals("Play Song")) {
            // Takes the user input for the song name then plays the entered song
            String songName = UserHelperMethods.getInputFromPrompt("What song would you like to play:");
            Song songToPlay = findSong(songName);
            playSong(songToPlay);
        } else if (userChoiceText.equals("Play Playlist")) {
            // Takes the user input for the playlist name then starts the entered playlist
            String playlistName = UserHelperMethods.getInputFromPrompt("What playlist would you like to play:");
            playPlaylist(playlistName);
        }

        // Waits for any playing songs to finish and returns to the Main Menu
        System.out.println("Returning to Main Menu...");
        mainMenu();
    }

    /**
     * Displays the manage playlists menu and handles the user choice
     */
    private void managePlaylistsMenu() {
        // Displays the manage playlists menu options and deceivers the users choice
        int userChoice = UserHelperMethods.displayOptionsAndWaitForValidOption(OptionStrings.MANAGE_PLAYLISTS_OPTIONS);
        String userChoiceText = OptionStrings.MANAGE_PLAYLISTS_OPTIONS[userChoice];

        // Checks for each of the options and handles accordingly
        if (userChoiceText.equals("Create Playlist")) {
            // Takes the user input for the playlist name then tries to create a new playlist
            String playlistName = UserHelperMethods.getInputFromPrompt("What should the playlist be called:");
            tryCreatePlaylist(playlistName);
        } else if (userChoiceText.equals("Show Playlists")) {
            // Prints our every playlist to the user
            UserHelperMethods.printMap(songDatabase.getPlaylists());
        } else if (userChoiceText.equals("Add Song to Playlist")) {
            // Takes the user input for the playlist name and Song then adds the song to the playlist
            String playlistName = UserHelperMethods.getInputFromPrompt("Playlist Name:");
            String songName = UserHelperMethods.getInputFromPrompt("Song Name:");
            String artist = UserHelperMethods.getInputFromPrompt("Artist of the song " + songName + ":");
            Song songToAdd = new Song(songName, artist);
            songDatabase.addSongToPlaylist(songToAdd, playlistName);
        } else if (userChoiceText.equals("Delete Song from Playlist")) {
            // Takes the user input for the playlist name and song name then deletes that song from the playlist
            String playlistName = UserHelperMethods.getInputFromPrompt("Playlist Name:");
            String songName = UserHelperMethods.getInputFromPrompt("Song Name:");
            Song songToRemoved = findSong(songName);
            songDatabase.deleteSongFromPlaylist(songToRemoved, playlistName);
        } else if (userChoiceText.equals("Delete Playlist")) {
            // Takes the user input for the playlist name then deletes that playlist
            String playlistName = UserHelperMethods.getInputFromPrompt("Playlist Name:");
            songDatabase.deletePlaylist(playlistName);
        }

        // Returns to the Main Menu
        System.out.println("Returning to Main Menu...");
        mainMenu();
    }

    /**
     * Displays the manage songs menu and handles the user choice
     */
    private void manageSongsMenu() {
        // Displays the manage songs menu options and deceivers the users choice
        int userChoice = UserHelperMethods.displayOptionsAndWaitForValidOption(OptionStrings.MANAGE_SONGS_OPTIONS);
        String userChoiceText = OptionStrings.MANAGE_SONGS_OPTIONS[userChoice];

        // Checks for each of the options and handles accordingly
        if (userChoiceText.equals("Show Song Library")) {
            // Prints out every song to the user
            List<Song> songs = new ArrayList<>(songDatabase.getSongArchive());
            UserHelperMethods.printSongs(songs);
        } else if (userChoiceText.equals("Add Song")) {
            // Takes the user input for the Song then adds the song
            String songName = UserHelperMethods.getInputFromPrompt("Song Name:");
            String artist = UserHelperMethods.getInputFromPrompt("Artist of the song " + songName + ":");
            Song songToAdd = new Song(songName, artist);
            songDatabase.addSong(songToAdd);
        } else if (userChoiceText.equals("Delete Song")) {
            // Takes the user input for the song name then deletes the song
            String songName = UserHelperMethods.getInputFromPrompt("What song would you like to delete:");
            Song songToDelete = findSong(songName);
            songDatabase.deleteSong(songToDelete);
            System.out.println("Deleted Song: " + songToDelete);
        }

        // Returns to the Main Menu
        System.out.println("Returning to Main Menu...");
        mainMenu();
    }

    /**
     * Finds the song for the given name, if more than one song is found, the user is prompted to select which song from all found
     * @param songName The song name
     * @return The song object
     */
    private Song findSong(String songName) {
        // Finds all songs that match the name in the database
        List<Song> foundSongs = songDatabase.findSongByName(songName);

        // If no songs were found display a message to the user, and return null
        if (foundSongs.isEmpty()) {
            System.out.println("SONG: " + songName +" was not found, returning to main menu:");
            return null;
        }

        // If only one song matches return that song
        else if (foundSongs.size() == 1) {
            return foundSongs.get(0);
        }

        // If multiple songs match call the displayOptionsAndWaitForValidOption method to have the user select from the songs
        else {
            int selectedSongIndex = UserHelperMethods.displayOptionsAndWaitForValidOption(foundSongs);
            return foundSongs.get(selectedSongIndex);
        }
    }

    /**
     * Plays the given song
     * @param song The song to be played
     * @return True if the next song should be played, and False if the next song should not be played
     */
    private boolean playSong(Song song) {
        // Sets play next song to false by default
        boolean playNextSong = false;

        // Checks if the song is not null
        if (song != null) {
            // Set the currently playing song, and print that song to the user
            currentlyPlaying = song;
            System.out.println("CURRENTLY PLAYING: " + song);

            // Displays the playing options menu and deceivers the users choice
            int userChoice = UserHelperMethods.displayOptionsAndWaitForValidOption(OptionStrings.PLAYING_OPTIONS);
            String userChoiceText = OptionStrings.PLAYING_OPTIONS[userChoice];

            // If the user wants to play the next song, set playNextSong to true
            if (userChoiceText == "Next") {
                playNextSong = true;
            }
        }

        // Return if the next song should be played
        return playNextSong;
    }

    /**
     * Plays the playlist with the given name
     * @param playlistName The playlist name to be played
     */
    private void playPlaylist(String playlistName) {
        // Gets the list of songs for the playlist of the matching name from the database
        List<Song> playlistSongs = songDatabase.getPlaylist(playlistName);

        // If the list is null or empty display a message to the user and return
        if (playlistSongs == null || playlistSongs.isEmpty()) {
            System.out.println("The playlist named '" + playlistName + "' does not exists or is an empty playlist");
            return;
        }

        // Sets the song queue to the playlist and sets the playNextSong to true
        songQueue = playlistSongs;
        boolean playNextSong = true;

        // Loops infinitely till the user doesn't want the next song to play
        while(playNextSong) {
            // If there are no remaining songs to play break out of the loop
            if (songQueue.isEmpty()) {
                break;
            }

            // Gets the first song in the array, and remove it from the queue
            Song songToPlay = songQueue.get(0);
            songQueue.remove(0);

            // Plays the song and waits for user input on whether the next song in the playlist should be played
            playNextSong = playSong(songToPlay);
        }

        // Prints a message to the user when the playlist is no longer being played
        System.out.println("Stopping Playlist...");
    }

    /**
     * Tries to create a playlist with the given name, and catches the database exception if the playlist already exists
     * @param playlistName
     */
    private void tryCreatePlaylist(String playlistName) {
        // Tries to create the playlist
        try {
            songDatabase.createPlaylist(playlistName);
            System.out.println("New Playlist Created: " + playlistName);
        }

        // Catches the IllegalArgumentException and displays a friendly error to the user
        catch (IllegalArgumentException exception) {
            System.out.println("A playlist already exists with the name: " + playlistName + ". A unique name is required.");
        }
    }

    /**
     * The main method and console app
     * NOTE: This has some seed data, but you can add any data you'd like in this method, just make sure to create mps and call the main menu method at the end
     * @param args The list of arguments
     */
    public static void main(String[] args) {
        // Initializes the MP3 console app
        MP3Player mp3 = new MP3Player();

        // Playlist name
        String seededPlaylist = "Rolling Stones - Greatest of All Time";

        // Originally Added Songs
        mp3.songDatabase.addSong(new Song("Like a Rolling Stone", "Bob Dylan"));
        mp3.songDatabase.addSong(new Song("(I Can't Get No) Satisfaction", "The Rolling Stones"));

        // Creates the playlist
        mp3.songDatabase.createPlaylist(seededPlaylist);

        // Adds song to the playlist, some of which are brand new to the MP3 Player
        mp3.songDatabase.addSongToPlaylist(new Song("Like a Rolling Stone", "Bob Dylan"), seededPlaylist);
        mp3.songDatabase.addSongToPlaylist(new Song("(I Can't Get No) Satisfaction", "The Rolling Stones"), seededPlaylist);
        mp3.songDatabase.addSongToPlaylist(new Song("Imagine", "John Lennon"), seededPlaylist);
        mp3.songDatabase.addSongToPlaylist(new Song("What's Going On", "Marvin Gaye"), seededPlaylist);
        mp3.songDatabase.addSongToPlaylist(new Song("Respect", "Aretha Franklin"), seededPlaylist);
        mp3.songDatabase.addSongToPlaylist(new Song("Good Vibrations", "The Beach Boys"), seededPlaylist);
        mp3.songDatabase.addSongToPlaylist(new Song("Johnny B. Goode", "Chuck Berry"), seededPlaylist);
        mp3.songDatabase.addSongToPlaylist(new Song("Hey Jude", "The Beatles"), seededPlaylist);
        mp3.songDatabase.addSongToPlaylist(new Song("Smells Like Teen Spirit", "Nirvana"), seededPlaylist);
        mp3.songDatabase.addSongToPlaylist(new Song("What'd I Say", "Ray Charles"), seededPlaylist);

        // Starts the application by opening the main menu
        mp3.mainMenu();
    }
}
