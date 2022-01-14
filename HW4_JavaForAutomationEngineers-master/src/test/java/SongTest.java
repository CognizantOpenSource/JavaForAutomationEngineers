/**
 * NOTE: This Test class is already complete and should be used as reference for the other test cases
 */

import models.Song;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SongTest {
    /**
     * This test is for the 'Getters'
     */
    @Test
    public void testGetters() {
        String testName = "Test Name";
        String testArtist = "Test Artist";

        Song song = new Song(testName, testArtist);

        Assert.assertEquals(song.getName(), testName);
        Assert.assertEquals(song.getArtist(), testArtist);
    }

    /**
     * This test is for the 'toString' override
     */
    @Test
    public void testToString() {
        String testName = "Test Name";
        String testArtist = "Test Artist";

        // This is the expected format of how the song is returned after 'toString' is called
        String unformattedExpectedString = "SONG TITLE: '%s' by '%s'";

        Song song = new Song(testName, testArtist);

        Assert.assertEquals(song.toString(), String.format(unformattedExpectedString, testName, testArtist));
    }

    /**
     * This test is for the 'equals' override
     */
    @Test
    public void testEquals() {
        Song song = new Song("SONG", "ARTIST");
        Song wrongSong = new Song("WRONG", "SONG");
        Song duplicateSong = new Song("SONG", "ARTIST");

        Assert.assertFalse(song.equals(wrongSong));
        Assert.assertTrue(song.equals(duplicateSong));
    }
}