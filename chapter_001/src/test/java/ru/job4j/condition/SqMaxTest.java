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

    @Test
    public void whenMaxSecond() {
        int first = 15;
        int second = 22;
        int third = 16;
        int forth = 16;
        int expected = 22;
        int result = SqMax.max(first, second, third, forth);
        assertThat(result, is(expected));
    }

    @Test
    public void whenMaxThird() {
        int first = 5;
        int second = 2;
        int third = 8;
        int forth = 6;
        int expected = 8;
        int result = SqMax.max(first, second, third, forth);
        assertThat(result, is(expected));
    }

    @Test
    public void whenMaxForth() {
        int first = 35;
        int second = 12;
        int third = 28;
        int forth = 88;
        int expected = 88;
        int result = SqMax.max(first, second, third, forth);
        assertThat(result, is(expected));
    }

    @Test
    public void whenEqually() {
        int first = 50;
        int second = 50;
        int third = 50;
        int forth = 50;
        int expected = 50;
        int result = SqMax.max(first, second, third, forth);
        assertThat(result, is(expected));
    }
}

