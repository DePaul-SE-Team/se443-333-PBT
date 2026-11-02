package ch5;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Size;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;


public class ArrayUtilsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testIndexOf(int[] array, int valueToFind, int startIndex, int expectedResult) {
        int result = ArrayUtils.indexOf(array, valueToFind, startIndex);
        assertThat(result).isEqualTo(expectedResult);
    }

    static Stream<Arguments> testCases() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 4, 6, 7 };

        return Stream.of(
            of(null, 1, 1, -1),
            of(new int[] { 1 }, 1, 0, 0),
            of(new int[] { 1 }, 2, 0, -1),
            of(array, 1, 10, -1),
            of(array, 2, -1, 1),
            of(array, 4, 6, -1),
            of(array, 4, 1, 3),
            of(array, 4, 3, 3),
            of(array, 4, 1, 3),
            of(array, 4, 4, 5),
            of(array, 8, 0, -1)
        );
    }

    //TODO
    // Write a test here
    // first perform specification
    // then derive property
    // use JQWIK to convert to property based testing

    /** Use this method to convert a list of integers to an array */
    private int[] convertListToArray(List<Integer> numbers) {
        int[] array = numbers.stream().mapToInt(x -> x).toArray();
        return array;
    }


}
