package lab2.controller;

import lab2.model.Faculty;
import lab2.model.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniversityCreator {
    public static final int MIN_NUMBER_UNIVERSITY_SIZE = 15;
    public static final int MAX_NUMBER_UNIVERSITY_SIZE = 30;
    public University createUniversityRandomly(){
        Random random = new Random();
        HumanCreator humanCreator = new HumanCreator();
        FacultyCreator facultyCreator = new FacultyCreator();

        int numberOfFaculties = random.nextInt(MIN_NUMBER_UNIVERSITY_SIZE) + MAX_NUMBER_UNIVERSITY_SIZE - MIN_NUMBER_UNIVERSITY_SIZE;
        University university=new University();
        university.setTitle("Dnipro University of Technology");

        university.setManager(humanCreator.createHumanRandomly());
        List<Faculty> faculties = new ArrayList<>();

        for(int i=0;i<numberOfFaculties;i++) {
            faculties.add(facultyCreator.createFacultyRandomly());
        }
        university.setFaculties(faculties);
        return university;
    }
}
