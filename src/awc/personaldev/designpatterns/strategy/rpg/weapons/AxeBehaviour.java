package awc.personaldev.designpatterns.strategy.rpg.weapons;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe.");
    }
}
