package test.java.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortFive() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThird() {
        int[] input = new int[] {3, 4, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortSix() {
        int[] input = new int[] {3, 4, 5, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
}