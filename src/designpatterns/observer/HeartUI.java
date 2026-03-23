package designpatterns.observer;

public class HeartUI implements HealthObserver {
    @Override
    public void onHealthChanged(int newHp) {
        System.out.println("Atualizando a UI: HP=" + newHp);
    }
}
