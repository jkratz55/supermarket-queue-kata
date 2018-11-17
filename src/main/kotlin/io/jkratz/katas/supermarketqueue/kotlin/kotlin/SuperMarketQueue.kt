package io.jkratz.katas.supermarketqueue.kotlin.kotlin

object SuperMarketQueue {

    fun calculateTime(customerTime: Array<Int>, numOfTills: Int): Int {

        if (numOfTills < 1) {
            throw IllegalArgumentException("numOfTills must be at a positive integer greater than 0")
        }

        val q: Array<Int> = Array(size = numOfTills) {
            0
        }

        customerTime.forEach { time ->
            q[q.indexOf(q.min())] += time
        }

        return q.max()!!;
    }
}