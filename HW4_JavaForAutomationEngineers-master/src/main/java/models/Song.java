package models;

/**
 * NOTE: This Song class is already complete and is the main model for this project
 */
public class Song implements Comparable<Song> {
    /**
     * The name of the song
     */
    private String name;

    /**
     * The name of the artist
     */
    private String artist;

    /**
     * Creates an instance of the Song class
     * @param name The song name
     * @param artist The artist's name
     */
    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    /**
     * Gets the name
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the artist
     * @return The artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the name if it is not null or whitespace
     * @param name The name
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the artist if it is not null or whitespace
     * @param artist The name
     */
    protected void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Converters a models.Song to a string description
     * @return The string representation of a 'models.Song' object
     */
    @Override
    public String toString() {
        return "SONG TITLE: '" + getName() + "' by '" + getArtist() + "'";
    }

    /**
     * Determines if this models.Song obj is equal to the provided object
     * @param obj The compared object
     * @return True if the Songs are the same, and false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // Checks if 'obj' is null or can't be assigned to a 'models.Song' class
        if (obj == null || !Song.class.isAssignableFrom(obj.getClass())) {
            return false;
        }

        // Casts the 'obj' to a 'models.Song' object
        final Song otherSong = (Song)obj;

        // Checks if the name and artist are the same
        if (this.getName().equals(otherSong.getName()) && this.getArtist().equals(otherSong.getArtist())) {
            return true;
        }

        // Returns false, as a catch all
        return false;
    }

    /**
     * IMPORTANT NOTE: THIS METHOD IS NEEDED FOR SIMPLICITY IN THE HOMEWORK, BUT IT IS NOT BEGINNER FRIENDLY YOU DO NOT NEED TO TOUCH THIS METHOD
     *                 For anyone who wants to learn more about compareTo read this link, but you have been warned: https://medium.com/omarelgabrys-blog/comparing-objects-307400115f88
     * @param otherSong The other song object
     * @return 0 if the songs are equal and other numbers if not
     */
    @Override
    public int compareTo(Song otherSong) {
        // Compares the models.Song Name by sending the compareTo call to the string level to find if they are different
        if (this.getName().compareTo(otherSong.getName()) > 0) { return 1; }
        else if (this.getName().compareTo(otherSong.getName()) < 0) { return -1; }
        else {
            // Compares the Artist by sending the compareTo call to the string level to find if they are different
            if (this.getArtist().compareTo(otherSong.getArtist()) > 0) { return 1; }
            else if (this.getArtist().compareTo(otherSong.getArtist()) < 0) { return -1; }

            // If we reach here both the name and artist were 0 meaning they were equal
            else { return 0; }
        }
    }

    /**
     * The main method
     * @param args The array of arguments
     */
    public static void main(String[] args) {
        Song songOne = new Song("NameOne", "ArtOne");
        Song songTwo = new Song("NameTwo", "ArtTwo");
        Song dupe = new Song("NameOne", "ArtOne");

        songOne.compareTo(songTwo);
        songOne.compareTo(dupe);

        // Using the 'toString' method
        System.out.println(songOne);
        System.out.println(songTwo);

        // Using the 'equals' method
        System.out.println("Songs are equal: " + songOne.equals(songTwo));

        // Updating songTwo to the same values as songOne
        songTwo.setName("NameOne");
        songTwo.setArtist("ArtOne");

        // Prints out songTwo and checks if the songs are now equal
        System.out.println(songTwo);
        System.out.println("Songs are equal: " + (songOne.equals(songTwo) && songTwo.equals(songOne)));
    }
}
