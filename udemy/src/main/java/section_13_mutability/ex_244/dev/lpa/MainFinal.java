package section_13_mutability. ex_244.dev.lpa;

import section_13_mutability. ex_244.dev.lpa.game.GameConsole;
import section_13_mutability. ex_244.dev.lpa.pirate.PirateGame;

//class SpecialGameConsole<T extends Game<? extends Player>>
//        extends GameConsole<Game<? extends Player>> {
//
//    public SpecialGameConsole(Game<? extends Player> game) {
//        super(game);
//    }
//}

public class MainFinal {

    public static void main(String[] args) {

        GameConsole<PirateGame> game =
                new GameConsole<>(new PirateGame("Pirate Game"));

    }
}
