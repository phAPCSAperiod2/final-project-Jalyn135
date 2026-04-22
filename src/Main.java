import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create some Meal objects
        Meal breakfast = new Meal("Oatmeal", 300, "2026-04-15");
        Meal lunch = new Meal("Chicken Salad", 500, "2026-04-15");
        Meal dinner = new Meal("Pasta", 700, "2026-04-15");

        // Put meals into a list
        ArrayList<Meal> meals = new ArrayList<>();
        meals.add(breakfast);
        meals.add(lunch);
        meals.add(dinner);

        // Print meals to verify data using getters
        System.out.println("Meals for the day:");
        for (Meal m : meals) {
            System.out
                    .println("Name: " + m.getMealName() + ", Calories: " + m.getCalories() + ", Date: " + m.getDate());
        }

        // Create a User
        User user = new User("Alex", 1800, 160.0);

        System.out.println("\nUser: " + user.getName());
        System.out.println("Calorie goal: " + user.getCalorieGoal());

        // Use NutritionCalculator to get total calories
        int totalCalories = NutritionCalculator.calculateTotalCalories(meals);
        System.out.println("Total calories consumed: " + totalCalories);

        // Compare to goal
        String feedback = NutritionCalculator.compareToGoal(totalCalories, user.getCalorieGoal());
        System.out.println("Feedback: " + feedback);
    }
}
