package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void whenMaxFirst() {
        int first = 10;
        int second = 8;
        int third = 6;
        int forth = 4;
        int expected = 10;
        int result = SqMax.max(first, second, third, forth);
        assertThat(result, is(expected));
    }


}

