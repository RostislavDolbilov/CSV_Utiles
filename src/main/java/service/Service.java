package service;

import model.Transaction;
import java.io.IOException;

public interface Service {
    public Transaction getTransactionById(String id) throws IOException;
}
