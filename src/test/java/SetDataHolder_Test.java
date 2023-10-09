import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.holder.IDataHolder;
import ru.holder.SetDataHolder;

public class SetDataHolder_Test {

    @Test
    public void checkForSuccessDataSetv1() {
        IDataHolder dataHolder = new SetDataHolder();
        dataHolder.addData('a');
        dataHolder.addData('b');
        dataHolder.addData('a');
        dataHolder.addData('c');

        Assertions.assertEquals("a, b, c", dataHolder.resultData());
    }

    @Test
    public void checkForSuccessDataSetv2() {
        IDataHolder dataHolder = new SetDataHolder();
        dataHolder.addData('a');
        dataHolder.addData('c');
        dataHolder.addData('b');
        dataHolder.addData('a');

        Assertions.assertEquals("a, c, b", dataHolder.resultData());
    }

    @Test
    public void checkForSuccessDataSetv3() {
        IDataHolder dataHolder = new SetDataHolder();
        dataHolder.addData('a');
        dataHolder.addData('c');
        dataHolder.addData('b');
        dataHolder.addData('a');
        dataHolder.addData('a');
        dataHolder.addData('a');
        dataHolder.addData('D');
        dataHolder.addData('d');

        Assertions.assertEquals("a, c, b, D, d", dataHolder.resultData());
    }
}
