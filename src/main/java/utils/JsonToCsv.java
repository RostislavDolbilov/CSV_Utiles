package utils;

import model.Constants;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONTokener;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonToCsv {
    public void toCsv(String jason){
        JSONArray jsonArray = new JSONArray(new JSONTokener(jason));
        try {
            Files.write(Path.of(Constants.CSV_DES),
                    CDL.toString(jsonArray).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
