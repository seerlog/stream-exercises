package org.example.mission.a;

import com.opencsv.CSVReader;
import lombok.Getter;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Database {
    private List<User> users = new ArrayList<>();

    public Database() {
        try {
            boolean isSkipFirstLine = false;
            CSVReader csvReader = new CSVReader(new FileReader("./src/main/resources/user.csv"));
            String[] nextLine;

            while ((nextLine = csvReader.readNext()) != null) {
                if(isSkipFirstLine) {
                    users.add(User.of(nextLine[0], nextLine[1], nextLine[2]));
                }
                isSkipFirstLine = true;
            }
        }
        catch (Exception e) {
            System.out.println("failed to read csv file");
        }
    }
}