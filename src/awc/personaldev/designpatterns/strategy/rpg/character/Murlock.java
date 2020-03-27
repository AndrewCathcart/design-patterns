package awc.personaldev.designpatterns.strategy.rpg.character;

public class Murlock extends RpgCharacter {

    public Murlock() {
        playable = false;
    }

    @Override
    public void printQuote() {
        System.out.println("\"Mrgllll glrrm gl!\"");
    }
}
