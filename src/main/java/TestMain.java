import utils.CsvToJson;
import utils.JsonToCsv;
import utils.UnzipFile;

import java.io.IOException;

public class TestMain {
    public static void main(String[] args){
        UnzipFile unzipFile = new UnzipFile();
        unzipFile.unzip();

        CsvToJson csvToJson = new CsvToJson();
        System.out.println(csvToJson.getJson());

        JsonToCsv jsonToCsv = new JsonToCsv();
        jsonToCsv.toCsv(csvToJson.getJson());


    }
}
