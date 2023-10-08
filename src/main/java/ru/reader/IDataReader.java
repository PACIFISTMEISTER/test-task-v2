package ru.reader;

import java.io.IOException;

public interface IDataReader {
    String[] getSymbols() throws IOException;
}
