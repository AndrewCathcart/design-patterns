package awc.personaldev.designpatterns.strategy.rpg.character;

import awc.personaldev.designpatterns.strategy.rpg.weapon.AxeBehaviour;

import java.util.Random;

public class Dwarf extends RpgCharacter {
    String[] quotes = new String[]{
            "\"Hey there!\"",
            "\"Ya got my attention.\"",
            "\"How are ya?\"",
            "\"Interest ya'n a pint?\"",
            "\"I've the finest wares in the land!\""
    };

    public Dwarf() {
        weaponBehaviour = new AxeBehaviour();
        playable = true;
    }

    @Override
    public void printQuote() {
        System.out.println(quotes[new Random().nextInt(quotes.length)]);
    }
}
