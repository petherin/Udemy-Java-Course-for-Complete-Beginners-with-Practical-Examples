package com.intermediate.abstraction.athlete;

import java.util.Random;

public class BasketballPlayer extends Athlete {
    private    double freeThrowPercentage;
    private   double pointsPerGame;


    public BasketballPlayer(String name, String nickname, int yearBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        super(name, nickname, yearBorn, team, gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;

    }

    public void freeThrow(){
        Random random=new Random();
        if ((random.nextDouble()*100) > freeThrowPercentage){
            System.out.println(super.getName() + " failed to score");
        } else {
            System.out.println(super.getName() + " scored");
        }
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Free throw percentage " + freeThrowPercentage);
        System.out.println("Points per game "+ pointsPerGame);
    }

    @Override
    public String getBodyType() {
        return "Tall lean";
    }
}
