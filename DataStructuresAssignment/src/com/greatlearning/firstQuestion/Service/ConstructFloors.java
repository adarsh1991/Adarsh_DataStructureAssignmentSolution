package com.greatlearning.firstQuestion.Service;

import java.util.PriorityQueue;

public class ConstructFloors {
    public void construct (int n, int[]array) {
        PriorityQueue<Integer> q2 = new PriorityQueue<>(java.util.Collections.reverseOrder());
        int[] s1 = new int[n];
        int max = n;
        System.out.println("The order of construction is as follows");

        for (int i = 0; i < n; i++) {

            System.out.println("Day: "+(i+1));
            s1[i] = array[i];
            q2.add(s1[i]);

            //Checks if queue is empty and if the top element is equal to max
            while (!q2.isEmpty() && q2.peek() == max) {

                System.out.print(q2.poll() + " ");
                max--;

            }
            System.out.println();
        }
    }
}