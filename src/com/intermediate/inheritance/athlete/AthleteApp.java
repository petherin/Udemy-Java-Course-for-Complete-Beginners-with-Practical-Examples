package com.intermediate.inheritance.athlete;

public class AthleteApp {
    public static void main(String[] args) {

        BasketballPlayer player = new BasketballPlayer("John", "Johnnyt", 1974, "Ilkkey", 55.3, 3.2, 418);
        BasketballPlayer player2 = new BasketballPlayer("John2", "Johnnyt2", 1974, "Ilkkey2", 65.3, 13.2, 1418);
        BasketballPlayer player3 = new BasketballPlayer("John23", "Johnnyt3", 1974, "Ilkke3y", 75.3, 23.2, 2418);
        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];
        basketballPlayers[0] = player;
        basketballPlayers[1] = player2;
        basketballPlayers[2] = player3;
        for (BasketballPlayer basketPlayer : basketballPlayers) {
            basketPlayer.getBio();
        }

        FootballPlayer tom = new FootballPlayer("Tom", "Bob", 1821, "Liverpool", 923, 7234, 28323);
        FootballPlayer bob = new FootballPlayer("Bob", "John", 2012, "Machetser", 1923, 17234, 128323);

        FootballPlayer[] footballPlayers = new FootballPlayer[2];
        footballPlayers[0] = tom;
        footballPlayers[1] = bob;
        for (FootballPlayer footballPlayer : footballPlayers) {
            footballPlayer.getBio();
        }
    }
}