package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Transaction;
import java.io.IOException;
import java.util.List;

public class JsonToTransactionsList {
    public List<Transaction> convertJsonToObjectsList(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, new TypeReference<List<Transaction>>(){});
    }
}
