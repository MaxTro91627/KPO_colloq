package org.example;

public class Subscriber {

    private String name;

    public Subscriber(String name, Chanel chanel) {
        this.name = name;
        chanel.addSubscriber(this);
    }

    void update(String newsChanel) {
        System.out.println(name + " получил уведомление о том, что " + newsChanel);
    }
}
