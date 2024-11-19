import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготовка данных
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызов целевого метода:
        long actual = service.calculate(amount, registered);

        // проверка (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготовка данных
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызов целевого метода:
        long actual = service.calculate(amount, registered);

        // проверка (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготовка данных
        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        // вызов целевого метода:
        long actual = service.calculate(amount, registered);

        // проверка (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготовка данных
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        // вызов целевого метода:
        long actual = service.calculate(amount, registered);

        // проверка (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
