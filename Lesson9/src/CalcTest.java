import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalcTest {

    @Test
    public void shouldSumIntegerWithoutException(){
        //given
        int a = 5, b = 7;
        int expected = 12;

        //when
        int actual = Calc.sum(a,b);

        //then
        assertEquals(expected,actual);


    }
}
