package ru.holder;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDataHolder implements IDataHolder {

    private final Set<String> resultSymbolSet = new LinkedHashSet<>();

    @Override
    public String resultData() {
        return String.join(", ", resultSymbolSet);
    }

    @Override
    public void addData(char s) {
        resultSymbolSet.add(Character.toString(s));
    }
}
