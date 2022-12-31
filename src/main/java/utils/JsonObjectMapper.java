package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.FullTransaction;
import model.Transaction;
import java.io.IOException;
import java.util.List;

public class JsonObjectMapper {
    public static List<Transaction> convertJsonToTransactionList(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, new TypeReference<List<Transaction>>(){});
    }

    public static List<Transaction> convertJsonToFullTransactionList(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, new TypeReference<List<FullTransaction>>(){});
    }
}
