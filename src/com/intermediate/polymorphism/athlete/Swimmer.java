package com.intermediate.polymorphism.athlete;

public class Swimmer extends Athlete implements Swimming {
    private int finaPoints;

    public Swimmer(String name, String nickname, int yearBorn, String team, int numberOfCompetitions, int finaPoints) {
        super(name, nickname, yearBorn, team, numberOfCompetitions);
        this.finaPoints=finaPoints;
    }

    @Override
    public String getBodyType() {
        return "Lean muscle, long torso, flexible ankles";
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.printf("FINA points:" + finaPoints);
    }

    @Override
    public void freeStyle() {
        System.out.println("Swimming free style");
    }

    @Override
    public void freeStyle(int distance) {
        System.out.println("Swimming free style distance: " + distance);
    }

    @Override
    public void compete() {
        super.compete();
        freeStyle();
    }
}
