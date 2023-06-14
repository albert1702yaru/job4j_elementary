package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1To9Then9() {
        int left = 3;
        int right = 1;
        int three = 9;
        int result = Max.max(left, right, three);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5To5To5Then5() {
        int left = 5;
        int right = 5;
        int three = 5;
        int four = 5;
        int result = Max.max(left, right, three, four);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}