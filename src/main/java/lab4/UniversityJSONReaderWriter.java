package lab4;

import com.google.gson.Gson;
import lab2.model.University;

import java.io.*;

public class UniversityJSONReaderWriter {

    public void writeToFile(University university, String path) {
        try {
            Gson gson = new Gson();
            String uniText = gson.toJson(university);
            FileWriter fileWriterAnother = new FileWriter(path);
            fileWriterAnother.write(uniText);
            fileWriterAnother.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public University readFromFile(String path) {
        String uniText = "";
        try {
            FileReader fileReaderAnother = new FileReader(path);
            BufferedReader br = new BufferedReader(fileReaderAnother);
            String str;
            while ((str = br.readLine()) != null) {
                uniText = uniText + "\n" + str;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        return gson.fromJson(uniText, University.class);

    }
}

