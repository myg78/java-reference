package com.test.problems;

public class FrogJump {

    public static void main(String[] args) {

        FrogJump frogJump = new FrogJump();
//        frogJump.solution(10, 85, 30);
//        frogJump.solution(0, 85, 30);
//        frogJump.solution(45, 85, 30);
//        frogJump.solution(1, 2, 1);
//        frogJump.solution(0, 2, 1);
//        frogJump.solution(2, 2, 1);
//        frogJump.solution(2, 10, 2);
        frogJump.solution(3, 999111321, 7);
    }

    public int solution(int startPos, int endPos, int jumpDistance) {
         System.out.println(String.format("%s : %s : %s", startPos, endPos, jumpDistance));
        int distance = endPos - startPos;
        double count = (double)distance / (double)jumpDistance;
         System.out.println("distance: " + distance);
         System.out.println("count: " + count);
        double ceil = Math.ceil(count);
        System.out.println("round: " + (int)ceil);
        return (int)ceil;
    }

}
