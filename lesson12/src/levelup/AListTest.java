package levelup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AListTest {

    AList list;

    @Before
    public void setUp() {
        list = new AList();
    }

    @Test
    public void shouldAddElementAndReturneSizeOne() throws Exception {
        //given
        int expected = 1;

        //when
        list.add(1);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 1", expected, actual);
    }

    @Test
    public void shouldCheckThanListEmpty() throws Exception {
        //given
        int expected = 0;

        //when
        list.add(0);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 0", expected, actual);
    }

    @Test
    public void shouldAddElementAndReturneSizeTwo() throws Exception {
        //given
        int expected = 2;

        //when
        list.add(5);
        list.add(6);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 2", expected, actual);
    }

    @Test
    public void shouldAddMoreElementaThanInitialSizeWithoutTroubles() throws Exception {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++) {
            list.add(i + 1);
        }
        int actual = list.size();


        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 11", expected, actual);
    }

    @Test
    public void shouldReturneLastAddedElement() {
        //given
        int expected = 11;


        //when
        for (int i = 0; i < 11; i++) {
            list.add(i + 1);
        }
        int lastAddedIndex = list.size() - 1;
        int actual = list.get(lastAddedIndex);

        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 11", expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetZeroElementAndThrowException() {

        //when
        list.get(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetElevenElementAndThrowException() {

        //when
        list.get(11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldTryToGetNegativeElevenElementAndThrowException() {

        //when
        list.get(-1);
    }

    @Test
    public void shouldRemoveElementFromEmptyList() throws Exception {
        //given
        int expected = 0;

        //when
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 1", expected, actual);

    }

    @Test
    public void shouldRemoveFirstElementFromListReternAndZero() throws Exception {
        //given
        int expected = 0;

        //when
        list.add(1);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 0", expected, actual);
    }
    @Test
    public void shouldRemoveSecondElementFromListAndReternOne() throws Exception {
        //given
        int expected = 1;

        //when
        list.add(1);
        list.add(2);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 1", expected, actual);
    }

    @Test
    public void shouldIncriseArrayLength() throws Exception {
        //given
        int expected = 12;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        int actual = list.getArrayLengs();

        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 12", expected, actual);
    }

    @Test
    public void shouldDecriseArrayLength() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        int actual = list.getArrayLengs();

        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 12", expected, actual);
    }
    @Test
    public void shouldDecriseArrayLengthToTen() throws Exception {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++) {
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        int actual = list.getArrayLengs();

        //then
        assertEquals("ERROR!!! Actual result is wrong Expected is 12", expected, actual);
    }

}