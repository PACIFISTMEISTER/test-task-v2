import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.check.ICheck;
import ru.check.SymbolCheck;

public class SymbolCheck_Test {

    @Test
    public void checkForLetterv1() {
        ICheck symbolCheck = new SymbolCheck();

        Assertions.assertTrue(symbolCheck.checkSymbol('a'));
    }

    @Test
    public void checkForNotLetter() {
        ICheck symbolCheck = new SymbolCheck();

        Assertions.assertFalse(symbolCheck.checkSymbol('!'));
    }

    @Test
    public void checkForLetterv2() {
        ICheck symbolCheck = new SymbolCheck();

        Assertions.assertTrue(symbolCheck.checkSymbol('ы'));
    }

    @Test
    public void checkForLetterv3() {
        ICheck symbolCheck = new SymbolCheck();

        Assertions.assertTrue(symbolCheck.checkSymbol('ь'));
    }

    @Test
    public void checkForLetterv4() {
        ICheck symbolCheck = new SymbolCheck();

        Assertions.assertTrue(symbolCheck.checkSymbol('ъ'));
    }

    @Test
    public void checkForLetterv5() {
        ICheck symbolCheck = new SymbolCheck();

        Assertions.assertTrue(symbolCheck.checkSymbol('h'));
    }
}
