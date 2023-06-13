package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1010to1210then2() {
        double expected = 2;
        Point a = new Point(10, 10);
        Point b = new Point(12, 10);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2020to2220then2() {
        double expected = 2;
        Point a = new Point(20, 20);
        Point b = new Point(22, 20);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3030to3230then2() {
        double expected = 2;
        Point a = new Point(30, 30);
        Point b = new Point(32, 30);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}