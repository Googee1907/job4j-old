package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] input = new int[] {23, 7, 35, 22, 15};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {7, 15, 22, 23, 35};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {10, 14, 1};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1, 10, 14};
        assertThat(result, is(expect));
    }
}
