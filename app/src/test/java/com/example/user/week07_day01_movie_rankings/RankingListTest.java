package com.example.user.week07_day01_movie_rankings;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 03/07/2017.
 */

public class RankingListTest {

    Movie movie01;
    Movie movie02;
    Movie movie03;
    Movie movie04;
    Movie movie05;
    Movie movie06;
    Movie movie07;
    Movie movie08;
    Movie movie09;
    Movie movie10;

    RankingList rankingList;

    @Before
    public void before() {
        movie01 = new Movie("The Goonies", "Adventure", 1);
        movie02 = new Movie("The Shawshank Redemption", "Crime", 2);
        movie03 = new Movie("The Godfather", "Crime", 3);
        movie04 = new Movie("12 Angry Men", "Crime", 4);
        movie05 = new Movie("Schindler's List", "Drama", 5);
        movie06 = new Movie("Pulp Fiction", "Crime", 6);
        movie07 = new Movie("Fight Club", "Drama", 7);
        movie08 = new Movie("Inception", "Sci-Fi", 8);
        movie09 = new Movie("Se7en", "Crime", 9);
        movie10 = new Movie("Leon", "Thriller", 10);
        rankingList = new RankingList();
        rankingList.addMovie(movie01);
        rankingList.addMovie(movie02);
        rankingList.addMovie(movie03);
        rankingList.addMovie(movie04);
        rankingList.addMovie(movie05);
        rankingList.addMovie(movie06);
        rankingList.addMovie(movie07);
        rankingList.addMovie(movie08);
        rankingList.addMovie(movie09);
        rankingList.addMovie(movie10);
    }

    @Test
    public void canAddMovie() {
        assertEquals("The Goonies", rankingList.getMovie(1).getTitle());
    }

    @Test
    public void canChangeLastMovie() {
        Movie movie11 = new Movie("One Flew Over The Cuckoo's Nest", "Drama", 10);
        rankingList.addMovie(movie11);
        assertEquals("One Flew Over The Cuckoo's Nest", rankingList.getMovie(10).getTitle());
    }

}
