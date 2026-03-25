package designpatterns.factory;

public class PiranhaPlant implements Enemy {
    public void attack() {
        System.out.println("Piranha attack...");
    }
    public String getName() {
        return "Goomba";
    }
}
