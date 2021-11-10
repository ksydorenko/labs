package lab4;

import com.google.gson.Gson;
import lab2.model.University;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UniversityJSONReaderWriter {
        public void writeToFile(University university, String path){
            try {
                FileWriter fileWriterAnother = new FileWriter("./src/main/resources/lab4.txt");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("");
            }
            Gson gson = new Gson();
            gson.toJson(university);
        }

        public  University readFromFile(String path) {
            try {
                FileReader fileReaderAnother = new FileReader("./src/main/resources/lab4.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Gson gson = new Gson();
            gson.fromJson("", University.class);

        }

    }

