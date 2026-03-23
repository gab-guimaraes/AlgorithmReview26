package designpatterns.observer;

public class PlayGame {
    public static void main(String[] args) {
        Player tupa = new Player("Tupã");
        HeartUI heartUI = new HeartUI();
        tupa.addObserver(heartUI);
        tupa.takeDamage(1);
        tupa.takeDamage(1);
        tupa.cure();
        tupa.cure();
        tupa.takeDamage(4);
    }
}
