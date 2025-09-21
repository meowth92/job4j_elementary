package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        /*
            �������� ����� ����, ����������� ��������� �������
            � �������� ������ ���������, �������� {1, 2, 3, 4, 5}.
         */
        int[] input = new int[] {4, 1, 6, 2, 3};
        int[] result = Turn.back(input);
        int[] expected = new int[] {3, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayW3() {
        /*
            �������� ����� ����, ����������� ��������� �������
            � �������� ������ ���������, �������� {1, 2, 3, 4, 5}.
         */
        int[] input = new int[] {4, 1, 6};
        int[] result = Turn.back(input);
        int[] expected = new int[] {6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArray6() {
        /*
            �������� ����� ����, ����������� ��������� �������
            � �������� ������ ���������, �������� {1, 2, 3, 4, 5}.
         */
        int[] input = new int[] {4, 1, 6, 2, 3, 1};
        int[] result = Turn.back(input);
        int[] expected = new int[] {1, 3, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }
}