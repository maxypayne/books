package section_13_mutability.ex_231.dev.hacker;

import section_13_mutability.ex_231.dev.lpa.PersonImmutable;

public class PersonOfInterest extends PersonImmutable {

    public PersonOfInterest(PersonImmutable person) {
        super(person);
    }

}
