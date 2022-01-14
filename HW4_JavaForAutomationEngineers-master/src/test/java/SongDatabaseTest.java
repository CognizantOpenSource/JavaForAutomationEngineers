import models.Song;
import models.SongDatabase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * TODO FOR HOMEWORK - SongDatabaseTest.java
 *      [ ] Write the 'testAddDeleteSong' test method
 *      [ ] Write the 'testAddGetDeletePlaylist' test method
 */
public class SongDatabaseTest {
    /**
     * TODO FOR HOMEWORK: Write a test for both adding and deleting songs from a song database
     * This tests adding and deleting songs
     */
    @Test
    public void testAddDeleteSong() {
        // TODO FOR HOMEWORK: Write a test for both adding and deleting songs from a song database
        SongDatabase database = new SongDatabase();
    }

    /**
     * TODO FOR HOMEWORK: Write a test for both adding and deleting playlists from a song database
     * This tests adding and deleting playlist
     */
    @Test
    public void testAddGetDeletePlaylist() {
        // TODO FOR HOMEWORK: Write a test for both adding and deleting playlists from a song database
        SongDatabase database = new SongDatabase();
    }

    /**
     * This tests adding and deleting songs from a playlist
     */
    @Test
    public void testAddDeleteSongFromPlaylist() {
        // Creates the SongDatabase instance and the testing variables
        SongDatabase database = new SongDatabase();
        String playlistName = "PlaylistOne";
        Song songOne = new Song("SongOne", "1");
        Song songTwo = new Song("SongTwo", "2");

        // Creates the database and verifies the database is added correctly
        database.createPlaylist(playlistName);
        Assert.assertTrue(database.getPlaylists().containsKey(playlistName));

        // Adds the first song to the playlist and asserts the song was added
        database.addSongToPlaylist(songOne, playlistName);
        Assert.assertTrue(database.getPlaylists().get(playlistName).contains(songOne));

        // Adds the second song to the playlist and asserts the song was added
        database.addSongToPlaylist(songTwo, playlistName);
        Assert.assertTrue(database.getPlaylists().get(playlistName).contains(songTwo));

        // Deleted the second song from the playlist
        database.addSongToPlaylist(songTwo, playlistName);

        // Deletes the same song a second time, ensure the code handles it correctly by not erroring
        database.deleteSongFromPlaylist(songTwo, playlistName);

        // Verifies the first song is still in the playlist and the second song is not in the database
        Assert.assertTrue(database.getPlaylists().get(playlistName).contains(songOne));
        Assert.assertFalse(database.getPlaylists().get(playlistName).contains(songTwo));
    }

    /**
     * This tests finding songs
     */
    @Test
    public void testFindingSongs() {
        // Creates the SongDatabase instance and the testing variables
        SongDatabase database = new SongDatabase();
        Song songOne = new Song("SongOne", "1");
        Song songTwo = new Song("SongTwo", "2");

        // Adds both songs to the database
        database.addSong(songOne);
        database.addSong(songTwo);

        // Finds all songs by song name that match the first song and verify that the first song is found
        List<Song> foundSongs = database.findSongByName("SongOne");
        Assert.assertTrue(foundSongs.contains(songOne));

        // Finds all songs by artist that match the second song and verify that the second song is found
        foundSongs = database.findSongsByArtist("2");
        Assert.assertTrue(foundSongs.contains(songTwo));
    }
}