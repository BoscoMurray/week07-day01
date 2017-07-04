package com.example.user.week07_day01_movie_rankings;

/**
 * Created by user on 03/07/2017.
 */

public class RankingList {

    private Movie[] rankingList = new Movie[10];

    public Movie getMovie(int rank) {
        return rankingList[rank -1];
    }

    public void addMovie(Movie movie) {
        int rank = movie.getRanking() -1;
        this.rankingList[rank] = movie;
    }

    public Movie findByTitle(String title) {
        for(Movie movie : rankingList) {
            if (movie.getTitle() == title) { return movie; }
        }
        return null;
    }

    public void moveUp(String title) {
        Movie up = findByTitle(title);
        int newRank = up.getRanking() -1;
        up.setRanking(newRank);
        Movie down = rankingList[newRank];
        down.setRanking(newRank +1);
        rankingList[newRank -1] = up;
        rankingList[newRank] = down;
    }

    public void moveDown(String title) {
        Movie down = findByTitle(title);
        int newRank = down.getRanking();
        down.setRanking(newRank);
        Movie up = rankingList[newRank];
        up.setRanking(newRank -1);
        rankingList[newRank] = down;
        rankingList[newRank -1] = up;
    }

}
