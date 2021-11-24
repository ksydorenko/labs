package lab2.controller;

import lab2.model.Group;
import lab2.model.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GroupCreator {
    public static final int MIN_NUMBER_GROUP_SIZE = 15;
    public static final int MAX_NUMBER_GROUP_SIZE = 30;
    public static final List<String> DICTIONARY_NAMES_OF_GROUPS = Arrays.asList("125-19-1", "126-20-1", "171-19-1", "029-17-1", "091-18-1");

    public Group createGroupRandomly() {
        Random random = new Random();
        HumanCreator humanCreator = new HumanCreator();
        int numberOfStudents = random.nextInt(MIN_NUMBER_GROUP_SIZE) + MAX_NUMBER_GROUP_SIZE - MIN_NUMBER_GROUP_SIZE;
        Group group = new Group();
        group.setTitle(DICTIONARY_NAMES_OF_GROUPS.get(random.nextInt(DICTIONARY_NAMES_OF_GROUPS.size() - 1)));
        group.setManager(humanCreator.createHumanRandomly());
        List<Human> students = new ArrayList<>();
        students.add(group.getManager());

        for (int i = 0; i < numberOfStudents; i++) {
            students.add(humanCreator.createHumanRandomly());
        }
        group.setStudents(students);
        return group;
    }
}
