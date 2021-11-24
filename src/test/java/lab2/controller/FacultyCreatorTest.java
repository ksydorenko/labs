package lab2.controller;

import lab2.model.Chair;
import lab2.model.Faculty;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

class FacultyCreatorTest {

    @Test
    void createFacultyRandomly() {
        float result = 0;
        int count = 30;
        for (int iter = 0; iter < count; iter++) {
            FacultyCreator creator = new FacultyCreator();
            Faculty faculty = creator.createFacultyRandomly();
            List<Chair> chairs = faculty.getChairs();
            HashSet<Chair> chairSet = new HashSet<>();

            for (int i = 0; i < chairs.size(); i++) {
                chairSet.add(chairs.get(i));
            }
            if (chairs.size() != chairSet.size()) {
                result++;
            }
        }
        System.out.println("Percentage of content at the faculty of chairs with the same name: " + result / count * 100 + "%");
    }
}