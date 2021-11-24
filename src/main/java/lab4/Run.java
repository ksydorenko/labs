package lab4;

import lab2.controller.UniversityCreator;
import lab2.model.University;

public class Run {
    public static void main(String[] args) {
        UniversityJSONReaderWriter universityJSONReaderWriter = new UniversityJSONReaderWriter();
        UniversityCreator universityCreator = new UniversityCreator();
        University originalUniversity = universityCreator.createUniversityRandomly();
        universityJSONReaderWriter.writeToFile(originalUniversity, "./src/main/resources/lab4.txt");
        University universityFromFile = universityJSONReaderWriter.readFromFile("./src/main/resources/lab4.txt");
    }
}
