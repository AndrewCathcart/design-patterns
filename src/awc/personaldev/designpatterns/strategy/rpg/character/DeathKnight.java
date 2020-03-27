package awc.personaldev.designpatterns.strategy.rpg.character;

import awc.personaldev.designpatterns.strategy.rpg.weapon.SwordBehaviour;

import java.util.Random;

public class DeathKnight extends RpgCharacter {
    String[] quotes = new String[]{
            "\"We press on!\"",
            "\"WHAT?!\"",
            "Ashes to Ashes.",
            "There is no escape...",
            "\"Our master's will, be done.\""
    };

    public DeathKnight() {
        weaponBehaviour = new SwordBehaviour();
        playable = true;
    }

    @Override
    public void printQuote() {
        System.out.println(quotes[new Random().nextInt(quotes.length)]);
    }
}
