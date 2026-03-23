package designpatterns.factory;

public class Koopa implements Enemy {
    @Override
    public void attack() {
        System.out.println("Koopa attack...");
    }
    @Override
    public String getName() {
        return "Goomba";
    }
}
