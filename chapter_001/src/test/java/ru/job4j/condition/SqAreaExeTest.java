package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaExeTest {

    @Test
    public void square() {
        int P = 6;
        int k = 2;
        int S = 2;
        int out = SqAreaExe.square(P, k);
        Assert.assertEquals(S, out);
    }
}