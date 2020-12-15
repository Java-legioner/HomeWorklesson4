package com.example.task_2;

public class Animal {

    private String specie;
    private int speed;
    private int age;

    public Animal(String specie, int speed, int age) {
        this.specie = specie;
        this.speed = speed;
        this.age = age;
    }

    public Animal(){

    }

    public String getSpecie() {
        return specie;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAge() {
        return age;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
