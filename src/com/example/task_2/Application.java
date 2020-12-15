package com.example.task_2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Application {
    public static void main(String[] args) {

        Animal animal = new Animal("Леопард", 20, 7);

        System.out.println("\"Назва тварини = " + animal.getSpecie() + ", Швидкість тварини = " + animal.getSpeed()
                + " км/год, Вік тварини = " + animal.getAge() + " років\" " + "\"_______________\"");

        animal.setSpecie("Бик");
        animal.setSpeed(2);
        animal.setAge(14);

        System.out.println("\"Назва тварини = " + animal.getSpecie() + ", Швидкість тварини = " + animal.getSpeed()
                + " км/год, Вік тварини = " + animal.getAge() + " років\"" );
    }


}
