package designpatterns.factory;

public class PiranhaPlant implements Enemy {
    @Override
    public void attack() {
        System.out.println("Piranha attack...");
    }
    @Override
    public String getName() {
        return "Goomba";
    }
}
