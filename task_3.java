import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    // Инициализируем поля класса в конструкторе
    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    // Помечаем метод аннотацией для параметров
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
            { 17, false },
            { 18, true },
            { 19, true },
            { 16, false }
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        // Передаем возраст пользователя
        boolean isAdult = program.checkIsAdult(age);
        // Сравниваем полученный и ожидаемый результат
        assertEquals(String.format("Для возраста %d ожидается результат %b", age, result), result, isAdult);
    }
}
