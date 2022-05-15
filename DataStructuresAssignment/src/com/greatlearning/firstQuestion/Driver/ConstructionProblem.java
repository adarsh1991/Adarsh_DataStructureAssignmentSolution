package com.greatlearning.firstQuestion.Driver;

import com.greatlearning.firstQuestion.Service.ConstructFloors;

import java.util.Scanner;

public class ConstructionProblem {
    public static void main(String[] args) {
        System.out.println("enter the total no of floors in the building");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        // Read the size of floors
        for (int i = 0; i < n; i++) {
            System.out.println("enter the floor size given on day :"+(i+1));
            array[i] = sc.nextInt();
        }
        ConstructFloors constructFloors = new ConstructFloors();
        constructFloors.construct(n, array);

        sc.close();
    }
}