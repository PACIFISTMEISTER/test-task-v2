package ru;

import ru.check.ICheck;
import ru.check.SymbolCheck;
import ru.holder.IDataHolder;
import ru.holder.SetDataHolder;
import ru.reader.FileDataReader;
import ru.reader.IDataReader;

import java.io.IOException;

public class Main {
//в данном случае рассматриваю, что заглавные буквы != прописным A!=a
//для того чтобы это исправить нужно всю строку привести либо к upper case либо к lower + удалить одно из условий в коде

    public static void main(String[] args) throws IOException {
        String file = args[0];

        IDataReader dataReader = new FileDataReader(file);
        ICheck symbolCheck = new SymbolCheck();
        IDataHolder dataHolder = new SetDataHolder();

        char[] symbols = dataReader.getSymbols();

        while (symbols != null) {

            for (char symbol : symbols) {
                if (symbolCheck.checkSymbol(symbol)) {
                    dataHolder.addData(symbol);
                }
            }

            symbols = dataReader.getSymbols();
        }
        System.out.println(dataHolder.resultData());
    }
}
