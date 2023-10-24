package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        List<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int index = 0;
        while (!queue.isEmpty()) {
            index = (index + everyDishNumberToEat - 1) % queue.size();
            result.add(queue.remove(index));
        }
        return result;

    }
}
