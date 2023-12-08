package com.intermediate.classesandobjects;

import java.util.Random;

public class BasketballPlayer {
    String name;
    String nickname;
    int yearBorn;
    String team;

    double freeThrowPercentage;
    double pointsPerGame;
    int gamesPlayed;

    public BasketballPlayer(String name, String nickname, int yearBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearBorn = yearBorn;
        this.team = team;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void freeThrow(){
        Random random=new Random();
        if ((random.nextDouble()*100) > freeThrowPercentage){
            System.out.println(name + " failed to score");
        } else {
            System.out.println(name + " scored");
        }
    }
}
