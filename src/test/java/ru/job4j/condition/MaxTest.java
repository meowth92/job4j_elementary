package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To3Then3() {
        int left = 1;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then3() {
        int left = 2;
        int right = 2;
        int a = 3;
        int result = Max.max(left, right, a);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then4() {
        int left = 1;
        int right = 2;
        int a = 3;
        int b = 4;
        int result = Max.max(left, right, a, b);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}