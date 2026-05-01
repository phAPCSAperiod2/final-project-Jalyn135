public class Main {
    public static void main(String[] args) {

        // Create a User
        User user = new User("Alex", 1800, 160.0);

        // Create NutritionManager for this user
        NutritionManager manager = new NutritionManager(user);

        // Create some Meal objects
        Meal breakfast = new Meal("Oatmeal", 300, "2026-04-15");
        Meal lunch = new Meal("Chicken Salad", 500, "2026-04-15");
        Meal dinner = new Meal("Pasta", 700, "2026-04-15");
        Meal snack = new Meal("Apple", 100, "2026-04-16");

        // Add meals to the manager
        manager.addMeal(breakfast);
        manager.addMeal(lunch);
        manager.addMeal(dinner);
        manager.addMeal(snack);

        // Print all meals to verify storage
        System.out.println("All logged meals:");
        for (Meal m : manager.getAllMeals()) {
            System.out.println(m);
        }

        // Test daily calories for 2026-04-15
        String date = "2026-04-15";
        int dailyTotal = manager.getDailyCalories(date);

        System.out.println("\nDaily calories for " + date + ": " + dailyTotal);

        // Compare to user's goal using NutritionCalculator
        System.out.println("User calorie goal: " + user.getCalorieGoal());
        String feedback = NutritionCalculator.compareToGoal(dailyTotal, user.getCalorieGoal());
        System.out.println("Feedback: " + feedback);

        // Test updating calorie goal
        manager.setCalorieGoal(1600);
        System.out.println("\nUpdated calorie goal: " + user.getCalorieGoal());
    }
}
