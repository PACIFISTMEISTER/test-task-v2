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
    public String[] getSymbols() throws IOException {
        String line = reader.readLine();
        if (line != null) {
            return line.split("");
        } else {
            reader.close();
            return null;
        }
    }
}
