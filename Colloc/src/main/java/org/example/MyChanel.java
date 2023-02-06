package org.example;

import java.util.ArrayList;
import java.util.List;

public class MyChanel implements Chanel {
    private List<Subscriber> subscribers;
    private String newsChanel;

    public MyChanel() {
        subscribers = new ArrayList<>();
    }

    public void setNews(String news) {
        this.newsChanel = news;
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers)
            subscriber.update(newsChanel);
    }
}