import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"SQRDataTest.csv"})
    public void test(int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(min, max);

        Assertions.assertEquals(expected, actual);
    }
}
