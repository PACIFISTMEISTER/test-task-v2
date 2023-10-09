package ru.check;

public class SymbolCheck implements ICheck {

    public SymbolCheck() {
    }

    @Override
    public boolean checkSymbol(char symbol) {
        return Character.isLetter(symbol);
    }
}
