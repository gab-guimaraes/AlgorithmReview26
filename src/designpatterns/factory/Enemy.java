package designpatterns.factory;

public abstract class Enemy {

    protected String name;
    protected int hp;

    public Enemy(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void takeDamage(int damage) {
        hp = Math.max(0, hp - damage);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public abstract void attack();
}