package awc.personaldev.designpatterns.strategy.rpg.character;

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
        playable = true;
    }

    @Override
    public void printQuote() {
        System.out.println(quotes[new Random().nextInt(quotes.length)]);
    }
}
