package awc.personaldev.designpatterns.strategy.rpg;

import awc.personaldev.designpatterns.strategy.rpg.character.DeathKnight;
import awc.personaldev.designpatterns.strategy.rpg.character.Dwarf;
import awc.personaldev.designpatterns.strategy.rpg.character.Murlock;
import awc.personaldev.designpatterns.strategy.rpg.character.RpgCharacter;
import awc.personaldev.designpatterns.strategy.rpg.weapon.MeleeBehaviour;

public class Main {
    public static void main(String[] args) {
        RpgCharacter arthas = new DeathKnight();
        arthas.printQuote();
        arthas.attack();

        RpgCharacter cruelFin = new Murlock();
        cruelFin.printQuote();
        cruelFin.attack();

        System.out.println("arthas disarmed");
        arthas.setWeaponBehaviour(new MeleeBehaviour());
        arthas.attack();

        RpgCharacter brann = new Dwarf();
        brann.printQuote();
        brann.attack();
    }
}
