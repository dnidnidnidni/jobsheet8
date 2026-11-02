import java.util.Scanner;

public class GroupScore12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j, score, bestGroup = 1;
        float totalScore, averageScore, highestAverage = 0;

        System.out.println("=== Welcome to the Group Score Calculator ===");

        while (i <= 6) {
            System.out.println("\nNow processing Group " + i + "... :)");
            totalScore = 0; 
            
            for (j = 1; j <= 5; j++) {
                System.out.print("  Enter the score from Rater group " + j + " (0-100): ");
                score = sc.nextInt();
                totalScore += score;
            }
            
            averageScore = totalScore / 5;
            System.out.println("-> The calculated average score for Group " + i + " is: " + averageScore);
        
            if (averageScore > highestAverage) {
                highestAverage = averageScore;
                bestGroup = i;
            }
            
            i++; 
        }
        
        System.out.println("\nAll 6 groups have been successfully processed.");
        System.out.println("The highest average score was " + highestAverage + " from Group " + bestGroup + ".");
        sc.close();
    }
}