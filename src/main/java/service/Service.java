package service;

import model.Transaction;
import utils.CsvJsonReader;
import utils.JsonObjectMapper;
import utils.ObjectJsonMapper;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public interface Service {
    public Transaction getTransactionById(String id) throws IOException;
}
