package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
       ArrayDeque<Integer> result = new ArrayDeque<>();

        result.offerLast(firstQueue.poll());
        result.offerLast(firstQueue.poll());
        result.offerLast(secondQueue.poll());
        result.offerLast(secondQueue.poll());

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            firstQueue.offer(result.pollLast());
            result.offerLast(firstQueue.poll()); //get first, add last
            result.offerLast(firstQueue.poll()); //get first, add last
            secondQueue.offer(result.pollLast());
            result.offerLast(secondQueue.poll()); //get first, add last
            result.offerLast(secondQueue.poll()); //get first, add last
        }
       return result;
    }
}
