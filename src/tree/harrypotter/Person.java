package tree.harrypotter;

public class Person {
    private String name;
    private HogwartsHouse house;
    private int age;
    private boolean dead;

    public Person(String name, HogwartsHouse house, int age, boolean dead) {
        this.name = name;
        this.house = house;
        this.age = age;
        this.dead = dead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HogwartsHouse getHouse() {
        return house;
    }

    public void setHouse(HogwartsHouse house) {
        this.house = house;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", house=" + house +
                ", age=" + age +
                '}';
    }
}