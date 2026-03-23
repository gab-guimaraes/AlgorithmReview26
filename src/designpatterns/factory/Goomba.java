package designpatterns.factory;

public class Goomba implements Enemy {
    @Override
    public void attack() {
        System.out.println("Goomba attack...");
    }
    @Override
    public String getName() {
        return "Goomba";
    }
}
