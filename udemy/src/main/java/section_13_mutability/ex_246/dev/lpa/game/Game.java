package section_13_mutability.ex_246.dev.lpa.game;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class Game<T extends section_13_mutability.ex_246.dev.lpa.game.Player> {

    private final String gameName;
    private final List<T> players = new ArrayList<>();
    private Map<Character, section_13_mutability.ex_246.dev.lpa.game.GameAction> standardActions = null;

    public Game(String gameName) {
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public Map<Character, section_13_mutability.ex_246.dev.lpa.game.GameAction> getStandardActions() {

        if (standardActions == null) {
            standardActions = new LinkedHashMap<>(Map.of(
                    'I',
                    new section_13_mutability.ex_246.dev.lpa.game.GameAction('I', "Print Player Info",
                            i -> this.printPlayer(i)),
                    'Q',
                    new section_13_mutability.ex_246.dev.lpa.game.GameAction('Q', "Quit Game",
                            this::quitGame)
            ));
        }
        return standardActions;
    }

    public abstract T createNewPlayer(String name);
    public abstract Map<Character, section_13_mutability.ex_246.dev.lpa.game.GameAction> getGameActions(int playerIndex);

    public final int addPlayer(String name) {

        T player = createNewPlayer(name);
        if (player != null) {
            players.add(player);
            return players.size() - 1;
        }
        return -1;
    }

    protected final T getPlayer(int playerIndex) {
        return players.get(playerIndex);
    }

    public boolean executeGameAction(int player, GameAction action) {
        return action.action().test(player);
    }

    public boolean printPlayer(int playerIndex) {

        section_13_mutability.ex_246.dev.lpa.game.Player player = players.get(playerIndex);
        System.out.println(player);
        return false;
    }

    public boolean quitGame(int playerIndex) {

        Player player = players.get(playerIndex);
        System.out.println("Sorry to see you go, " + player.name());
        return true;
    }
}