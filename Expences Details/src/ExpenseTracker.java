import java.util.*;
public class ExpenseTracker {
    ArrayList<Expense> expenses = new ArrayList<>();

    void addExpense() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expense description: ");
        String description = scanner.nextLine();
        System.out.print("Enter expense amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter expense category: ");
        String category = scanner.nextLine();

        Expense expense = new Expense(description, amount, category);
        expenses.add(expense);
        System.out.println("Expense added successfully!");
    }

    void viewExpenses() {
        System.out.println("Expense List:");
        for (Expense expense : expenses) {
            System.out.println("Description: " + expense.description);
            System.out.println("Amount: " + expense.amount);
            System.out.println("Category: " + expense.category);
            System.out.println("--------------------");
        }
    }

}
