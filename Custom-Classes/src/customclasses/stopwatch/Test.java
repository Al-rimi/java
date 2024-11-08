package customclasses.stopwatch;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int[] numbers = new int[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 1000000);
        }

        stopWatch.start();
        Arrays.sort(numbers);
        stopWatch.stop();

        System.out.printf("Elapsed time for sorting %,d elements: %.3f seconds", 
            numbers.length, stopWatch.getElapsedTime() / 1000.0);
    }
}
