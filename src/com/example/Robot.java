package com.example;

public class Robot {

    private String name;
    private String say;

    public Robot(String name, String say) {
        this.name = name;
        this.say = say;
    }

    public Robot(){

    }

    public String getName() {
        return name;
    }

    public String getSay() {
        return say;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public void work(){
        System.out.println("Я " + name + " - " + say);
    }


}
