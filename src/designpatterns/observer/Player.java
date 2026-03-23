package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int hp;
    private int maxHp;
    private List<HealthObserver> observers = new ArrayList<>();

    public Player(String name) {
        this.name = name;
        this.hp = 3;
        System.out.println("Player created, name: " + name + "\n hp: " + hp);
    }

    public void takeDamage(int damage) {
        hp = hp - damage;
        nofityObservers();
        if (hp <= 0) die();
    }

    public void cure() {
        if (hp >= maxHp) return;
        hp = hp + 1;
        nofityObservers();
    }

    public void die() {
        System.out.println("Player died");
    }

    public void addObserver(HealthObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(HealthObserver observer) {
        observers.remove(observer);
    }

    private void nofityObservers() {
        for (HealthObserver observer : observers) {
            observer.onHealthChanged(hp);
        }
    }
}
