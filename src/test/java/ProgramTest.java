
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class Program {
    public boolean checkIsAdult(int age) {
        return age >= 18;
    }
}

public class ProgramTest {

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True2() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertTrue("Пользователь не достиг 18 лет", isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Пользователь не достиг 18 лет", true, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(10);
        assertEquals("Пользователю более 18 лет", false, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals("Пользователю не 18 лет", true, isAdult);
    }
}

//@RunWith(Parameterized.class)
//public class CheckIsAdultTest {
//
//    private final int age;
//    private final boolean result;
//
//    public CheckIsAdultTest(int age, boolean result) {
//        this.age = age;
//        this.result = result;
//    }
//
//    @Parameterized.Parameters
//    public static Object[][] getTextData() {
//        return new Object[][] {
//                { 50, true},
//                { 2, false},
//                { 18, true},
//                { 21, true},
//    };
//    }
//
//    @Test
//    public void checkIsAdultWhenAgeThenResult() {
//        Program program = new Program();
//        boolean isAdult = program.checkIsAdult(age);
//        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
//        assertEquals("Пользователь несовершеннолетний", result, isAdult);
//    }
//}