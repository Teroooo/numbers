package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    @Test
    public void deduplicate() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);
        List<Integer> expected = Arrays.asList(1,2,4,5);

        ListDeduplicator deduplicator = new ListDeduplicator();
        GenericListSorter sorted = new ListSorter();
        List<Integer> distinct = deduplicator.deduplicate(list, sorted);

        Assertions.assertEquals(expected, distinct);
    }
    private class ListSorterStud implements GenericListSorter{
        public List<Integer> sort(List<Integer> list) {

            return Arrays.asList(1, 2, 2, 4);
        }
    }

    @Test
    public void deduplicating() {
        List<Integer> list = Arrays.asList(1,2,4,2);
        List<Integer> expected = Arrays.asList(1,2,4);

        ListDeduplicator deduplicator = new ListDeduplicator();

        GenericListSorter sorted = new ListSorterStud();

        List<Integer> distinct = deduplicator.deduplicate(list,sorted);

        Assertions.assertEquals(expected, distinct);
    }

}