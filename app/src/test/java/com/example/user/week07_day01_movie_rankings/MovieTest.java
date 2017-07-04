package com.example.user.week07_day01_movie_rankings;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 03/07/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before() {
        movie = new Movie("The Goonies", "Adventure", 1);
    }

    @Test
    public void canGetTitle() {
        assertEquals("The Goonies", movie.getTitle());
    }

    @Test
    public void canSetTitle() {
        movie.setTitle("Back To The Future");
        assertEquals("Back To The Future", movie.getTitle());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Adventure", movie.getGenre());
    }

    @Test
    public void canSetGenre() {
        movie.setGenre("Sci-Fi");
        assertEquals("Sci-Fi", movie.getGenre());
    }

    @Test
    public void canGetRanking() {
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void canSetRanking() {
        movie.setRanking(2);
        assertEquals(2, movie.getRanking());
    }

    @Test
    public void canReturnDetails() {
        assertEquals("Title: 'The Goonies', Genre: 'Adventure', Ranking: 1", movie.toString());
    }

}
