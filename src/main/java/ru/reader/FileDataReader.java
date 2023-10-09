package ru.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReader implements IDataReader {

    private final BufferedReader reader;

    public FileDataReader(String file) throws FileNotFoundException {
        this.reader = new BufferedReader(new FileReader(file));
    }

    @Override
    public char[] getSymbols() throws IOException {
        String line = reader.readLine();
        if (line != null) {
            return line.toCharArray();
        } else {
            reader.close();
            return null;
        }
    }
}
