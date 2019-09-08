package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    @Test
    public void when3x3() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String nl = System.getProperty("line.separator");
        String expect = String.format("X X%s X %sX X%s", nl, nl, nl);
        assertThat(result, is(expect));
    }

    @Test
    public void when5x4() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String nl = System.getProperty("line.separator");
        String expect = String.format("X X X%s X X %sX X X%s X X %s", nl, nl, nl, nl);
        assertThat(result, is(expect));
    }
}