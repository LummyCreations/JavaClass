package org.howard.edu.lsp.exam.question42;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {

	 @Test 
	  public static List<Genre> getGenre(String songName) {
	        for (SongsDatabase song : songs) {
	            if (song.getName().equals(songName)) {
	                return genre
	            }
	        }
	        return new ArrayList(); //Return empty list if no genre found for a given name
	   

	 private static List<Genre> genres = new ArrayList<>();
	 

	    public static List<Song> getSongs(String genreName) {
	        for (SongsDatabase genre : genres) {
	            if (genre.getName().equals(genreName)) {
	                return genre.getSongs();
	            }
	        }
	        return new ArrayList(); //Return empty list if no songs found for a given name
	    }
	   public static void add(Song song, String genreName) {
	    for (Genre genre : genres) {
	        if (genre.getName().equals(genreName)) {
	            genre.getSongs().add(song);
	            return;
	        }
	    }
	    //If no genre was found (return would have been called), create a new one
	    Genre genre = new Genre(genreName);
	    genre.getSongs().add(song);
	    genres.add(genre);

	}


}
