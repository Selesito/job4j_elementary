package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To8To6Then8() {
        int result = Max.max(2, 8, 6);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax7To2To4To1Then2() {
        int result = Max.max(7, 2, 4, 1);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
}