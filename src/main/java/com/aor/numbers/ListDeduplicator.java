package com.aor.numbers;
import java.util.ArrayList;
import java.util.List;

public class ListDeduplicator implements GenericListDeduplicator {
    public List<Integer> deduplicate(List<Integer> list, GenericListSorter sorted) {
        list = sorted.sort(list);
        List<Integer> unique = new ArrayList<>();

        Integer last = null;

        for (Integer number : list)
            if (!number.equals(last)) {
                last = number;
                unique.add(number);
            }

        return unique;
    }
}