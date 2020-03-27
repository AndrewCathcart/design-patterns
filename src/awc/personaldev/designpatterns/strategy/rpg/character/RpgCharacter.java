package awc.personaldev.designpatterns.strategy.rpg.character;

import awc.personaldev.designpatterns.strategy.rpg.weapons.WeaponBehaviour;

public abstract class RpgCharacter {
    WeaponBehaviour weaponBehaviour;
    Boolean playable;

    public RpgCharacter() {
    }

    public abstract void printQuote();

    public void setWeaponBehaviour(WeaponBehaviour wb) {
        this.weaponBehaviour = wb;
    }

    public void attack() {
        weaponBehaviour.useWeapon();
    }
}
