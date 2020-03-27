package awc.personaldev.designpatterns.strategy.rpg.weapon;

public class MeleeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Hitting with bare knuckles.");
    }
}
