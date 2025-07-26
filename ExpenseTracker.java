import java.util.Scanner;
    public class ExpenseTracker {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] categories = {"Food", "Travel", "Utility", "Others"};
            double[] expenses = new double[categories.length];

            System.out.println("🧾 Enter your expenses for each category:");
            for (int i = 0; i < categories.length; i++) {
                System.out.print("Enter " + categories[i] + " expense: ₹ ");
                expenses[i] = sc.nextDouble();
            }

            System.out.println("\n📊 Expense Summary:");
            double total = 0;
            for (int i = 0; i < categories.length; i++) {
                System.out.println(categories[i] + ": ₹ " + expenses[i]);
                total += expenses[i];
            }

            System.out.println("\n💰 Total Expense: ₹ " + total);
            sc.close();
        }
    }

