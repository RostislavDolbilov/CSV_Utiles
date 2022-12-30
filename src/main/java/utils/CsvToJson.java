package utils;

import model.Constants;
import org.json.CDL;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class CsvToJson {
    /*
        <dependency>
            <groupId>org.json</groupId>
            <artifactId>json</artifactId>
            <version>20220320</version>
        </dependency>
     */
    public String getJson(){
        InputStream inputStream = CsvToJson.class.getClassLoader().getResourceAsStream(Constants.CSV_FILE);

        assert inputStream != null;
        String csvAsString = new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .collect(Collectors.joining("\n"));

        return CDL.toJSONArray(csvAsString).toString();
    }
}
