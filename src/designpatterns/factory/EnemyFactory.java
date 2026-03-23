package designpatterns.factory;

public class EnemyFactory {

    public static Enemy create(String type) {
        switch (type) {
            case "goomba":
                return new Goomba();
            case "koopa":
                return new Koopa();
            case "piranha":
                return new PiranhaPlant();
            default:
                throw new IllegalArgumentException("invalid input");
        }
    }
}