package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenCalc1() {
        Fact.calc(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCalc8() {
        Fact.calc(-8);
    }
}