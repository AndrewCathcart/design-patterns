package awc.personaldev.designpatterns.strategy.rpg.character;

import awc.personaldev.designpatterns.strategy.rpg.weapon.MeleeBehaviour;

public class Murlock extends RpgCharacter {

    public Murlock() {
        weaponBehaviour = new MeleeBehaviour();
        playable = false;
    }

    @Override
    public void printQuote() {
        System.out.println("\"Mrgllll glrrm gl!\"");
    }
}
