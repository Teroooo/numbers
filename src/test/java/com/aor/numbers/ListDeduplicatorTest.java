package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    private List<Integer> list;
    private ListDeduplicator deduplicator;
    private  List<Integer> expected;

    @BeforeEach
    public void helper() {
        list = Arrays.asList(1,2,4,2,5);
        expected = Arrays.asList(1,2,4,5);
        deduplicator = new ListDeduplicator();
    }

    @Test
    public void deduplicate() {

        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }
}
