package io.jkratz.katas.supermarketqueue.kotlin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuperMarketQueue {

    public static int calculateTime(int[] customerTime, int numOfTills) {

        // Convert array to list to make it easier to work with
        List<Integer> customerTimings = Arrays.stream(customerTime)
                .boxed()
                .collect(Collectors.toList());

        // If there are no tills throw error now to avoid divide be 0 later
        if (numOfTills < 1) {
            throw new IllegalArgumentException("numOfTills must be at a positive integer greater than 0");
        }

        // Zero fill temporary list
        List<Integer> q = Stream.generate(() -> 0)
                .limit(numOfTills)
                .collect(Collectors.toList());

        for (int i : customerTimings) {
            int min = Collections.min(q);
            int index = q.indexOf(min);
            int currentValue = q.get(index);
            q.set(index, (currentValue += i));
        }

        return Collections.max(q);
    }
}
