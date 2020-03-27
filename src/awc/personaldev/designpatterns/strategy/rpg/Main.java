package awc.personaldev.designpatterns.strategy.rpg;

import awc.personaldev.designpatterns.strategy.rpg.character.DeathKnight;
import awc.personaldev.designpatterns.strategy.rpg.character.Dwarf;
import awc.personaldev.designpatterns.strategy.rpg.character.Murlock;
import awc.personaldev.designpatterns.strategy.rpg.character.RpgCharacter;
import awc.personaldev.designpatterns.strategy.rpg.weapons.AxeBehaviour;
import awc.personaldev.designpatterns.strategy.rpg.weapons.MeleeBehaviour;
import awc.personaldev.designpatterns.strategy.rpg.weapons.SwordBehaviour;

public class Main {
    public static void main(String[] args) {
        RpgCharacter arthas = new DeathKnight();
        arthas.setWeaponBehaviour(new SwordBehaviour());
        arthas.printQuote();
        arthas.attack();

        RpgCharacter cruelFin = new Murlock();
        cruelFin.setWeaponBehaviour(new MeleeBehaviour());
        cruelFin.printQuote();
        cruelFin.attack();

        RpgCharacter brann = new Dwarf();
        brann.setWeaponBehaviour(new AxeBehaviour());
        brann.printQuote();
        brann.attack();
    }
}
