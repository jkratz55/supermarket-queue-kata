package io.jkratz.katas.supermartketqueue;

import io.jkratz.katas.supermarketqueue.SuperMarketQueue;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuperMarketQueueTest {

    @Test
    public void testNormalCondition() {
        assertEquals(9, SuperMarketQueue.calculateTime(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
        assertEquals(12, SuperMarketQueue.calculateTime(new int[] {2,3,10}, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, SuperMarketQueue.calculateTime(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, SuperMarketQueue.calculateTime(new int[] { 1, 2, 3, 4, 5 }, 1));
    }
}
