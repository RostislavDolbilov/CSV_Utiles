package utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import model.Constants;
import model.Transaction;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class TransactionsCSVCreator {
    public  void createCsvFile(List<Transaction> transactions) throws IOException {
        File csvOutputFile = new File(Constants.CSV_DES);
        CsvMapper csvMapper = new CsvMapper();
        csvMapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);

        CsvSchema schema = CsvSchema.builder().setUseHeader(true)
                .addColumn("id")
                .addColumn("userId")
                .addColumn("name")
                .addColumn("amount")
                .addColumn("ip")
                .build();

        ObjectWriter writer = csvMapper.writerFor(Transaction.class).with(schema);
        writer.writeValues(csvOutputFile).writeAll(transactions);
    }
}
