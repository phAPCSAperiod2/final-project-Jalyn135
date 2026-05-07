import java.util.Scanner;

/**
 * Runs the weekly health tracker application, allowing the user to select meals
 * and compare totals to a goal.
 */
public class Main {
    /**
     * Entry point for the health tracker program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Weekly Health Tracker!");
        System.out.print("Enter your weekly calorie goal: ");
        int goal = scanner.nextInt();

        HealthTracker tracker = new HealthTracker(goal);

        boolean addingMeals = true;

        while (addingMeals) {
            tracker.showHealthyOptions();
            System.out.print("Enter the number of the meal you want to add: ");
            int choice = scanner.nextInt();

            Meal selectedMeal = tracker.createMealFromChoice(choice);

            if (selectedMeal != null) {
                tracker.addMeal(selectedMeal);
                System.out.println(selectedMeal.getMealName() + " added!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

            System.out.print("Do you want to add another meal? (yes/no): ");
            String again = scanner.next().toLowerCase();

            if (again.equals("no")) {
                addingMeals = false;
            }
        }

        // End of week summary
        tracker.printWeeklyMeals();
        int total = tracker.getTotalWeeklyCalories();
        System.out.println("\nTotal calories for the week: " + total);
        System.out.println(tracker.compareToGoal());

        scanner.close();
    }
}
