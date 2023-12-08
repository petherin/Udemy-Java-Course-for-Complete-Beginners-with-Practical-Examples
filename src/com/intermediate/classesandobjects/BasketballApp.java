package com.intermediate.classesandobjects;

public class BasketballApp {
    public static void main(String[] args) {

        BasketballPlayer player=new BasketballPlayer("John","Johnnyt",1974, "Ilkkey", 55.3, 3.2,418);
        BasketballPlayer player2=new BasketballPlayer("John2","Johnnyt2",1974, "Ilkkey2", 65.3, 13.2,1418);
        BasketballPlayer player3=new BasketballPlayer("John23","Johnnyt3",1974, "Ilkke3y", 75.3, 23.2,2418);
  BasketballPlayer[]  basketballPlayers= new BasketballPlayer[3];
        basketballPlayers[0]= player;
        basketballPlayers[1]= player2;
        basketballPlayers[2]= player3;
        for (BasketballPlayer basketPlayer : basketballPlayers){
            basketPlayer.freeThrow();
        }

  
    }
}
