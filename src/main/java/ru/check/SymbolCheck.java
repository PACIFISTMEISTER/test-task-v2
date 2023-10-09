package ru.check;

public class SymbolCheck implements ICheck {

    public SymbolCheck() {
    }

    @Override
    public boolean checkSymbol(char symbol) {
//приведение вспомогательных знаков(к примеру восклицательного) к upper case не изменяет строку
// условие или для того чтобы учесть регистр
        return Character.isLetter(symbol);
    }
}
