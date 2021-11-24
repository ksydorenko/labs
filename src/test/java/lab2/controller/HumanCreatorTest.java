package lab2.controller;

import lab2.model.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HumanCreatorTest {

    @Test
    void createHumanRandomly() {
        HumanCreator creator = new HumanCreator();
        Human human = creator.createHumanRandomly();
        assertTrue(HumanCreator.DICTIONARY_NAMES.contains(human.getName()));
        assertTrue(HumanCreator.DICTIONARY_SURNAMES.contains(human.getSurname()));
        assertTrue(HumanCreator.DICTIONARY_DAY_OF_BIRTH.contains(human.getDateOfBirth()));
    }
}