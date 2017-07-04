package com.example.user.week07_day01_movie_rankings;

/**
 * Created by user on 03/07/2017.
 */

public class RankingList {

//    private String[] rankingList;
    private String[] rankingList = new String[10];

    public String getMovie(int rank) {
        return rankingList[rank -1];
    }

    public void addMovie(Movie movie) {
        int rank = movie.getRanking() -1;
        String title = movie.getTitle();
        this.rankingList[rank] = title;
    }



}