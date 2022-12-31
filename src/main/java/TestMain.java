
import lombok.extern.slf4j.Slf4j;
import model.FullTransaction;
import model.Transaction;
import utils.CsvJsonReader;
import utils.JsonObjectMapper;
import utils.ObjectJsonMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TestMain {
    public static void main(String[] args) throws IOException {

        //reading basic csv file to json string
        CsvJsonReader csvToJson = new CsvJsonReader();
        String json = csvToJson.getJsonFromBasicCsv();
        log.info(json);

        //mapping json from basic csv string to List<Transactions>
        JsonObjectMapper jsonToTransactionsList = new JsonObjectMapper();
        List<Transaction> transactions = jsonToTransactionsList.convertJsonToTransactionList(json);
        log.info(transactions.toString());

        //mapping basic transactions to full transactions
        List<FullTransaction> fullTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            FullTransaction fullTransaction = new FullTransaction();
            fullTransaction.setId(transaction.getId());
            fullTransaction.setUserId(transaction.getUserId());
            fullTransaction.setName(transaction.getName());
            fullTransaction.setAmount(transaction.getAmount());
            fullTransaction.setIp(transaction.getIp());
            fullTransactions.add(fullTransaction);
        }
        log.info(fullTransactions.toString());

        // mapping full transaction to json
        ObjectJsonMapper objectJsonMapper = new ObjectJsonMapper();
        log.info(objectJsonMapper.getJson(fullTransactions));



    }
}
