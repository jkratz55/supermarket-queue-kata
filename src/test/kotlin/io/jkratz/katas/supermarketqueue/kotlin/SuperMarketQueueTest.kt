package io.jkratz.katas.supermarketqueue.kotlin

import io.jkratz.katas.supermarketqueue.kotlin.kotlin.SuperMarketQueue
import junit.framework.Assert.assertEquals
import org.junit.Test

class SuperMarketQueueTest {

    @Test
    fun testNormalCondition() {
        assertEquals(9, SuperMarketQueue.calculateTime(arrayOf(2, 2, 3, 3, 4, 4), 2))
        assertEquals(12, SuperMarketQueue.calculateTime(arrayOf(2, 3, 10), 2))
    }

    @Test
    fun testEmptyArray() {
        assertEquals(0, SuperMarketQueue.calculateTime(arrayOf(), 1))
    }

    @Test
    fun testSingleTillManyCustomers() {
        assertEquals(15, SuperMarketQueue.calculateTime(arrayOf(1, 2, 3, 4, 5), 1))
    }
}