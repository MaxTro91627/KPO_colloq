package org.example;

public class Client {
    public static void main(String[] args) {
        var myChanel = new MyChanel();

        new Subscriber("Иван Иванов", myChanel);
        new Subscriber("Евгений Евгеньев", myChanel);

        myChanel.setNews("вышел новый подкаст");
    }
}