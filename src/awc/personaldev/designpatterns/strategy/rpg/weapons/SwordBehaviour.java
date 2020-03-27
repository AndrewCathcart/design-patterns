package awc.personaldev.designpatterns.strategy.rpg.weapons;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Slashing with a sword.");
    }
}
