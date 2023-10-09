package ru.reader;

import java.io.IOException;

public interface IDataReader {
    char[] getSymbols() throws IOException;
}
