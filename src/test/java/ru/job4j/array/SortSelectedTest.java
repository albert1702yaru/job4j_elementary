package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortTwy() {
        int[] data = new int[] {10, 45, 89, 73, -5, -54};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-54, -5, 10, 45, 73, 89};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFree() {
        int[] data = new int[] {150, 345, -989, -673, -45, -954};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-989, -954, -673, -45, 150, 345};
        assertThat(result).containsExactly(expected);
    }
}