package models;

import java.util.*;

/**
 * TODO FOR HOMEWORK - SongDatabase.java
 *      [ ] Complete the 'addSong' method
 *      [ ] Throw an IllegalArgumentException when a playlist of the given name already exists in the 'createPlaylist' method
 *      [ ] Complete the 'getPlaylist' method
 *      [ ] Complete the 'addSongToPlaylist' method
 *      [ ] Complete the 'findSongByName' method
 *      [ ] Complete the 'findSongByArtist' method
 */
public class SongDatabase {
    /**
     * A unique list of every song in the models.Song Database
     */
    private Set<Song> songArchive;

    /**
     * The playlists are a map of playlist name to a list of songs
     */
    private Map<String, List<Song>> playlists;

    /**
     * Creates an instance of the SongDatabase class
     */
    public SongDatabase() {
        // A TreeSet is a type of set, a unique element array, and more info on tree sets can be found here: https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html
        songArchive = new TreeSet<Song>();
        // A Hashmap is a type of map, key to value collection, and more info on hash maps can be found here: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
        playlists = new HashMap<String, List<Song>>();
    }

    /**
     * Gets the song archive
     * @return The song archive
     */
    public Set<Song> getSongArchive() {
        return songArchive;
    }

    /**
     * Gets the playlists
     * @return The playlists
     */
    public Map<String, List<Song>> getPlaylists() {
        return playlists;
    }

    /**
     * Sets the Song archive
     * @param songArchive The new song archive
     */
    protected void setSongArchive(TreeSet<Song> songArchive) {
        this.songArchive = songArchive;
    }

    /**
     * Sets the playlists
     * @param playlists
     */
    protected void setPlaylists(Map<String, List<Song>> playlists) {
        this.playlists = playlists;
    }

    /**
     * TODO FOR HOMEWORK: Complete this method
     * Adds the given song to the song archive
     * @param newSong The song to be added
     */
    public void addSong(Song newSong) {
        // TODO FOR HOMEWORK: Add the given song to the song archive
    }

    /**
     * Deletes the given song from all playlists and the song archive
     * @param songToBeDeleted The song to be deleted
     */
    public void deleteSong(Song songToBeDeleted) {
        // First we must check if the song is in our archive, otherwise we would be wasting time cause why delete what doesn't exist?
        if (songArchive.contains(songToBeDeleted)) {
            // Cycles through each song in the archive to find the matching song
            for (Song song : songArchive) {
                // Checks if the current song is equal to the song that should be deleted
                if (song.equals(songToBeDeleted)) {
                    // Two things must be done when we find the song in the archives
                    // 1. Remove that song from ALL playlist as the song is no longer in the database
                    // 2. Remove the song from the archive

                    // Cycles through each playlist name from the playlists map
                    for (String playlistName : playlists.keySet()) {
                        // Calls the deleteSongFromPlaylist method which will check every song in the playlist for deletion
                        deleteSongFromPlaylist(song, playlistName);
                    }

                    // Removes the song from the archives
                    songArchive.remove(song);

                    // NOTE: This is a really tricky line of code but it IS needed, before reading the rest think why a 'break' ('return' works too) is needed here
                    // Explanation: This break will stop going through each song in the song archive. If you don't stop the loop here,
                    //              the loop will try to grab the next song in the archive, BUT the archive as been change.
                    //              This will throw an exception, thus you should normally escape a loop, if what you are cycling through is changed.
                    //              You can avoid 'break'ing if you are cleaver, and in fact the 'deleteSongFromPlaylist' method does this
                    break;
                }
            }
        }
    }

    /**
     * TODO FOR HOMEWORK: Throw an IllegalArgumentException when a playlist of the given name already exists
     * Creates a new playlist with the given name
     * @param playlistName The playlist name
     * @throws IllegalArgumentException if a playlist already exists with the given name
     */
    public void createPlaylist(String playlistName) throws IllegalArgumentException {
        // Checks if the playlists already has a key for the given playlist name
        if (playlists.containsKey(playlistName)) {
            // TODO FOR HOMEWORK: Throw the IllegalArgumentException with a custom message
        }

        // Puts the playlist name into the playlists and maps it to a new empty list of songs
        playlists.put(playlistName, new ArrayList<Song>());
    }

    /**
     * TODO FOR HOMEWORK: Complete this method to get the list of songs for the given playlist
     * Gets the list of songs for the given playlist name
     * @param playlistName The playlist name
     * @return The list of songs for the playlist if that playlist exists, and null otherwise
     */
    public List<Song> getPlaylist(String playlistName) {
        // TODO FOR HOMEWORK: Add the conditional for returning the playlist

        // Returns null if no songs are found for the given playlist name
        return null;
    }

    /**
     * Deletes the playlist with the given playlist name
     * @param playlistName The playlist name
     */
    public void deletePlaylist(String playlistName) {
        // Checks if the playlists contain a playlist with the given name
        if (playlists.containsKey(playlistName)) {
            // Removes the playlist of the given name
            playlists.remove(playlistName);
        }
    }

    /**
     * TODO FOR HOMEWORK: Complete this method to add a song to the playlist
     *                    NOTE: You MUST handle the case where a playlist with the given name doesn't exist and when the song isn't in the archive
     *                          This can be done a couple ways, but we recommend just creating the playlist/adding to the archives if it doesn't exist
     *                          Don't worry about duplicate songs you can have repeated songs in the same playlist
     * Adds a song to the playlist
     * @param newSong The new song
     * @param playlistName The playlist name
     */
    public void addSongToPlaylist(Song newSong, String playlistName) {
        // TODO FOR HOMEWORK: Add the given song to the playlist of the given name
    }

    /**
     * Deletes the given song from the playlist that matches the given playlist name
     * @param songToBeDeleted The song to be deleted
     * @param playlistName The playlist name where the song should be deleted
     */
    public void deleteSongFromPlaylist(Song songToBeDeleted, String playlistName) {
        // Checks if the playlist name is in the playlists
        if (playlists.containsKey(playlistName)) {
            // Gets the list of songs from the playlists map
            List<Song> listOfPlaylistSongs = playlists.get(playlistName);

            // Checks if the list of songs contain the song to be deleted
            if (listOfPlaylistSongs.contains(songToBeDeleted)) {
                // NOTE: This is cleaver way of deleting elements from a list when you know there could be duplicates
                // Explanation: This is a 'reversed' for loop, since we are starting with the last element in the last and moving to the beginning.
                //              If we starting at the beginning of the array, we would be moving elements up in index, which means we could skip checking songs
                //              If we start a 0, and delete 0, the array that was at index 2 gets moved up to 1. And the element at 1 is now at 0. And will NEVER be checked cause the loop will next check index 1.
                //              Starting at the back will avoid this, since removing element at index 2 will not change the elements at index 1 or 0, which would be the only elements left to check
                for (int index = listOfPlaylistSongs.size() - 1; index >= 0; index--) { // TODO DUSTIN : EXPLAIN
                    // Checks if the current song at the current index is the song that should be deleted
                    if (songToBeDeleted.equals(listOfPlaylistSongs.get(index))) {
                        // Deleted the song at the current index
                        playlists.get(playlistName).remove(index);
                    }
                }
            }
        }
    }

    /**
     * TODO FOR HOMEWORK: Complete this method
     * Returns a List of models.Song object from archive, and an empty list if no songs are found
     * @param songName The song name
     * @return The List of models.Song object, and an empty list if no songs are found
     */
    public List<Song> findSongByName(String songName) {
        // TODO FOR HOMEWORK: Remove the line below, and return a list of songs that match the given song name
        return null;
    }

    /**
     * TODO FOR HOMEWORK: Complete this method
     * Returns a List of models.Song object from archive, and an empty list if no songs from the artist are found
     * @param artist The artist
     * @return The List of models.Song object, and an empty list if no songs from the artist are found
     */
    public List<Song> findSongsByArtist(String artist) {
        // TODO FOR HOMEWORK: Remove the line below, and return a list of songs that match the given artist
        return null;
    }

    /**
     * The main method of the Song Database class
     * @param args The array of arguments
     */
    public static void main(String[] args) {
        SongDatabase db = new SongDatabase();

        db.addSong(new Song("TEST NAME", "TEST ART"));
        System.out.println(db.getSongArchive().size());

        System.out.println(db.songArchive.contains(new Song("TEST NAME", "TEST ART")));
        db.deleteSong(new Song("TEST NAME", "TEST ART"));
        System.out.println(db.songArchive.contains(new Song("TEST NAME", "TEST ART")));
    }
}
