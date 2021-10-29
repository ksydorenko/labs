package lab2.controller;

import lab2.model.Chair;
import lab2.model.Group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChairCreator {
    public static final int MIN_NUMBER_CHAIR_SIZE = 5;
    public static final int MAX_NUMBER_CHAIR_SIZE = 10;
    public static final List<String> DICTIONARY_NAMES_OF_CHAIRS= Arrays.asList("Chair of Software Engineering","Chair of Computer Technology","Chair of Manager","Chair of Electrical Engineering","Chair of Physics" );

    public Chair createChairRandomly(){
        Random random = new Random();
        GroupCreator groupCreator = new GroupCreator();
        HumanCreator humanCreator = new HumanCreator();
        int numberOfGroups= random.nextInt(MIN_NUMBER_CHAIR_SIZE)+MAX_NUMBER_CHAIR_SIZE-MIN_NUMBER_CHAIR_SIZE;
        Chair chair = new Chair();

        chair.setTitle(DICTIONARY_NAMES_OF_CHAIRS.get(random.nextInt(DICTIONARY_NAMES_OF_CHAIRS.size()-1)));

        chair.setManager(humanCreator.createHumanRandomly());
        List<Group> groups = new ArrayList<>();

        for(int i=0;i<numberOfGroups;i++) {
            groups.add(groupCreator.createGroupRandomly());
        }
        chair.setGroups(groups);
        return chair;
    }
}
