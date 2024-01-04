package com.intermediate.polymorphism.athlete;

public abstract class Athlete {
    private   String name;
    private  String nickname;
    private    int yearBorn;
    private    String team;


    private   int numberOfCompetitions;

    public Athlete(String name, String nickname, int yearBorn, String team, int numberOfCompetitions) {
        this.name = name;
        this.nickname = nickname;
        this.yearBorn = yearBorn;
        this.team = team;
        this.numberOfCompetitions = numberOfCompetitions;
    }

    public void compete(){
        System.out.println(name + " took part in a competition");
        numberOfCompetitions++;
    }
    public String getName() {
        return name;
    }

    public void getBio(){
        System.out.println(name + " " + nickname);
        System.out.println("Born in"+ yearBorn);
        System.out.println("Last team is " + team + "and played " + numberOfCompetitions);
    }

    public abstract String getBodyType();
}
