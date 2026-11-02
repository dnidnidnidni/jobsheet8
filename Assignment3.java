import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of cafe branches: ");
        int numBranches = sc.nextInt();
        
        System.out.println("\n=== Sales Input Per Branch ===");
        
        int totalCustomersAllBranches = 0;
        int totalItemsAllBranches = 0;
        
        for (int i = 1; i <= numBranches; i++) {
            System.out.println("\n--- Branch " + i + " ---");
            System.out.print("Number of customers: ");
            int numCustomers = sc.nextInt();
            
            int itemsPerBranch = 0;
            
            for (int j = 1; j <= numCustomers; j++) {
                System.out.print("- How many items did customer " + j + " order? ");
                int itemsOrdered = sc.nextInt();
                itemsPerBranch += itemsOrdered;
            }
            
            System.out.println("Branch " + i + ":");
            System.out.println("- Customers: " + numCustomers);
            System.out.println("- Items sold: " + itemsPerBranch);
            
            totalCustomersAllBranches += numCustomers;
            totalItemsAllBranches += itemsPerBranch;
        }
        
        System.out.println("\nTotal across all branches:");
        System.out.println("Customers: " + totalCustomersAllBranches);
        System.out.println("Items sold: " + totalItemsAllBranches);
        
        sc.close();
    }
}