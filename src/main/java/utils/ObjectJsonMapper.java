package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.FullTransaction;
import java.util.List;

public class ObjectJsonMapper {
    public static String getJson(List<FullTransaction> transactions){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson.toJson(transactions);
    }
}
