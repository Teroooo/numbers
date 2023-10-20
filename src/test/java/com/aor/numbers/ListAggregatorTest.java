package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    private List<Integer> list;
    private ListAggregator aggregator;
    @BeforeEach
    public void helper() {
        list = Arrays.asList(1,2,4,2,5);
        aggregator= new ListAggregator();
    }

    @Test
    public void max_bug_7263() {
        List<Integer> l = Arrays.asList(-1,-4,-5);
        int max = aggregator.max(l);
        Assertions.assertEquals(-1, max);
    }
    @Test
    public void sum() {

        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);

    }

    @Test
    public void max() {

        int max = aggregator.max(list);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {
        helper();
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }
    @Test
    public void distinct_bug_8726() {
        List<Integer> l = Arrays.asList(-1,-4,-5);
        int distinct = aggregator.distinct(l);
        Assertions.assertEquals(-1, distinct);
    }
    @Test
    public void distinct() {

        int distinct = aggregator.distinct(list);

        Assertions.assertEquals(4, distinct);
    }
}
