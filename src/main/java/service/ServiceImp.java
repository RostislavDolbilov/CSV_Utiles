package service;

import model.Transaction;
import utils.CsvJsonReader;
import utils.JsonObjectMapper;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ServiceImp implements Service{
    @Override
    public Transaction getTransactionById(String id) throws IOException {
        List<Transaction> transactions = JsonObjectMapper.convertJsonToTransactionList(CsvJsonReader.getJsonFromBasicCsv());
        return transactions.stream()
                .filter(transaction -> Objects.equals(transaction.getId(), id))
                .collect(Collectors.toList()).get(0);
    }
}
