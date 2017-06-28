import spock.lang.Specification

import static org.junit.Assert.assertArrayEquals as assertArrayEquals

class SorterTest extends Specification {


    def "BubbleSort test"() {
        int[] actual = [8, 5, 3, 6, 1, 0];
        int[] expected = [0, 1, 3, 5, 6, 8];

        when:
        Sorter.bubbleSort(actual)

        expected:
        assertArrayEquals(expected, actual)
    }

    def "BubbleSort test3"() {
        int[] actual = [];
        int[] expected = [];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected, actual)
        }

    def "BubbleSort test4"() {
        int[] actual =  [1];
        int[] expected = [1];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected, actual)
    }

    def "BubbleSort test5"() {
        int[] actual =  [0, 2, 4] ;
        int[] expected = [4, 0, 2];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected, actual)
    }
    def "BubbleSort test6"() {
        int[] actual =  [-2, 0, 4]  ;
        int[] expected = [4, 0, -2];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected, actual)
    }

    def "BubbleSort test7"() {
        int[] actual =  [0, 1, 3, 5, 6, 8];
        int[] expected = [8, 5, 3, 6, 1, 0];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected, actual)
    }

    def "BubbleSort test8"() {
        int[] actual =  [0, 1, 3, 5, 6, 8];
        int[] expected = [0, 1, 3, 5, 6, 8];

        when:
        Sorter.bubbleSort(actual)

        then:
        assertArrayEquals(expected, actual)
    }
}