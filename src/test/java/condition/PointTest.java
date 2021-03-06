package test.java.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to64then4() {
        int expected = 4;
        Point a = new Point(2, 4);
        Point b = new Point(6, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when46to40then6() {
        int expected = 6;
        Point a = new Point(4, 6);
        Point b = new Point(4, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to22then0() {
        int expected = 0;
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}