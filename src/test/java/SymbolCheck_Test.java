import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.check.ICheck;
import ru.check.SymbolCheck;

public class SymbolCheck_Test {

    @Test
    public void checkForLetter() {
        ICheck symbolCheck = new SymbolCheck();

        Assertions.assertTrue(symbolCheck.checkSymbol("a"));
    }

    @Test
    public void checkForNotLetter() {
        ICheck symbolCheck = new SymbolCheck();

        Assertions.assertFalse(symbolCheck.checkSymbol("!"));
    }
}
