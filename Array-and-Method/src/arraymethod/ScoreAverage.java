package arraymethod;
import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[100];
        int count = 0;
        int total = 0;

        System.out.println("Enter scores (negative number to end):");
        while (true) {
            int score = input.nextInt();
            if (score < 0)
                break;
            scores[count++] = score;
            total += score;
        }

        input.close();

        double average = total / (double) count;
        int aboveOrEqual = 0, below = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }
        System.out.println("Average: " + average);
        System.out.println("Scores above or equal to average: " + aboveOrEqual);
        System.out.println("Scores below average: " + below);
    }
}