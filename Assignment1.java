import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum value of n: ");
        int maxN = sc.nextInt();

        // Outer loop controls the rows (n = 1, 2, 3...)
        for (int i = 1; i <= maxN; i++) {
            System.out.print("n = " + i + " -> sum of squares = ");
            int sum = 0;

            // Inner loop calculates the squares and formats the addition string
            for (int j = 1; j <= i; j++) {
                int square = j * j;
                sum += square;
                System.out.print(square);
                
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + sum);
        }
        sc.close();
    }
} 
