package utils;

import model.Constants;
import org.json.CDL;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class CsvJsonReader {
    public static String getJsonFromBasicCsv(){
        InputStream inputStream = CsvJsonReader.class.getClassLoader().getResourceAsStream(Constants.BASIC_CSV_FILE);

        assert inputStream != null;
        String csvAsString = new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .collect(Collectors.joining("\n"));

        return CDL.toJSONArray(csvAsString).toString();
    }

    public static String getJson(String fileName){
        InputStream inputStream = CsvJsonReader.class.getClassLoader().getResourceAsStream(Constants.CSV_FILE_ADDRESS + fileName);

        assert inputStream != null;
        String csvAsString = new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .collect(Collectors.joining("\n"));

        return CDL.toJSONArray(csvAsString).toString();
    }
}
