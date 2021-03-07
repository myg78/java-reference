package com.test.problems;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
//        int jumps = 5;
//        int[] array = {1,3,1,4,2,3,5,4};

//        int jumps = 1;
//        int[] array = {1,2,3,4,5,6};

        int jumps = 5;
        int[] array = {5,1,2,1,3,2,4};

        int solution = frogRiverOne.solution(jumps, array);
        System.out.println("solution: " + solution);

        int solution2 = frogRiverOne.frog(jumps, array);
        System.out.println("solution2: " + solution2);
    }

    public int solution(int jumps, int[] array) {

        Set<Integer> leavesPosition = new HashSet<>();
        Set<Integer> allPositions = new HashSet<>();

        // all positions
        for (int i = 0; i < jumps; i++) {
            allPositions.add(i+1);
        }
        // System.out.println("all: " + allPositions);

        int goPosition = -1;
        for (int i = 0; i < array.length; i++) {
            leavesPosition.add(array[i]);
            System.out.println(String.format("%s: %s", i, leavesPosition));
            if (leavesPosition.containsAll(allPositions)) {
                System.out.println("match: " + i);
                goPosition = i;
                break;
            }
        }

        return goPosition;
    }

    public int frog(int jumps, int[] array) {
        int steps = jumps;
        boolean[] bitmap = new boolean[steps+1];
        for(int i = 0; i < array.length; i++){
            if(!bitmap[array[i]]){
                bitmap[array[i]] = true;
                steps--;
                if(steps == 0) return i;
            }
        }
        return -1;
    }

}
