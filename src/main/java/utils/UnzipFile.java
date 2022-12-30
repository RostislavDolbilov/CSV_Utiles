package utils;

import model.Constants;
import net.lingala.zip4j.core.ZipFile;

import java.io.File;

public class UnzipFile {
    /*
        <dependency>
            <groupId>net.lingala.zip4j</groupId>
            <artifactId>zip4j</artifactId>
            <version>1.3.2</version>
        </dependency>
     */
    public void unzip() {
        File file = new File(Constants.CSV_FILE_ADDRESS);
        if (file.exists()){
            return;
        }
        try {
            ZipFile zipFile = new ZipFile(Constants.FILE_ZIP);
            zipFile.extractAll(Constants.FILE_DES);
        } catch (net.lingala.zip4j.exception.ZipException e) {
            e.printStackTrace();
        }
    }
}
