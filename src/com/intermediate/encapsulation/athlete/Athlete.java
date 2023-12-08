package com.intermediate.encapsulation.athlete;

public class Athlete {
    private   String name;
    private  String nickname;
    private    int yearBorn;
    private    String team;


    private   int gamesPlayed;

    public Athlete(String name, String nickname, int yearBorn, String team, int gamesPlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearBorn = yearBorn;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void getBio(){
        System.out.println(name + " " + nickname);
        System.out.println("Born in"+ yearBorn);
        System.out.println("Last team is " + team + "and played " + gamesPlayed);
    }
}
