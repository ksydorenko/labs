package lab2.controller;

import lab2.model.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HumanCreator {
    public static HumanCreator humanCreator;
    public static final List<String> DICTIONARY_NAMES= Arrays.asList("Oleg","Masha","Sasha","Hanna","Oksana","Kate","Olga","Nik");
    public static final List<String> DICTIONARY_SURNAMES= Arrays.asList("Khessin","Moskvyp","Didov","Koval","Ench","Momod","Tenh","Sivarenko");
    public static final List<String> DICTIONARY_DAY_OF_BIRTH= Arrays.asList("12-12-1989","14-06-2000","02-09-1999","25-03-1987","05-07-1977","13-02-2004","17-05-1982","03-09-1970");

    public Human createHumanRandomly() {
        Random random = new Random();
        Human human = new Human();
        human.setName(DICTIONARY_NAMES.get(random.nextInt(DICTIONARY_NAMES.size()-1)));
        human.setSurname(DICTIONARY_SURNAMES.get(random.nextInt(DICTIONARY_SURNAMES.size()-1)));
        human.setDateOfBirth(DICTIONARY_DAY_OF_BIRTH.get(random.nextInt(DICTIONARY_DAY_OF_BIRTH.size()-1)));
        return human;
    }


}
