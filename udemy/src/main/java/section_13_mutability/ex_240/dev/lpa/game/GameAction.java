package section_13_mutability. ex_240.dev.lpa.game;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {
}
