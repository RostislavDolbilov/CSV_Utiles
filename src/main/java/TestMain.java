
import model.Transaction;
import utils.CsvToJson;
import utils.JsonToTransactionsList;
import utils.TransactionsCSVCreator;
import utils.UnzipFile;
import java.io.IOException;
import java.util.List;

public class TestMain {
    public static void main(String[] args) throws IOException {
        //unzip
        UnzipFile unzipFile = new UnzipFile();
        unzipFile.unzip();

        //reading csv file to json string
        CsvToJson csvToJson = new CsvToJson();
        String json = csvToJson.getJson();
        System.out.println(csvToJson.getJson());

        //mapping json string to List<Transactions>
        JsonToTransactionsList jsonToTransactionsList = new JsonToTransactionsList();
        List<Transaction> transactions = jsonToTransactionsList.convertJsonToObjectsList(json);
        System.out.println(transactions);

        //creating csv file with transactions
        TransactionsCSVCreator transactionsCSVCreator = new TransactionsCSVCreator();
        transactionsCSVCreator.createCsvFile(transactions);

    }
}
