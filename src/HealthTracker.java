import java.util.ArrayList;

public class HealthTracker {

    private ArrayList<Meal> weeklyMeals = new ArrayList<>();
    private int weeklyCalorieGoal;

    public HealthTracker(int weeklyCalorieGoal) {
        this.weeklyCalorieGoal = weeklyCalorieGoal;
    }

    // List of healthy foods the user can choose from
    public void showHealthyOptions() {
        System.out.println("\nChoose a meal from the list below:");
        System.out.println("1. Grilled Chicken - 400 calories");
        System.out.println("2. Oatmeal - 300 calories");
        System.out.println("3. Salad - 250 calories");
        System.out.println("4. Fruit Bowl - 150 calories");
        System.out.println("5. Smoothie - 200 calories");
        System.out.println("6. Brown Rice & Veggies - 350 calories");
    }

    // Convert user choice into a Meal object
    public Meal createMealFromChoice(int choice) {
        switch (choice) {
            case 1: return new Meal("Grilled Chicken", 400, "Week");
            case 2: return new Meal("Oatmeal", 300, "Week");
            case 3: return new Meal("Salad", 250, "Week");
            case 4: return new Meal("Fruit Bowl", 150, "Week");
            case 5: return new Meal("Smoothie", 200, "Week");
            case 6: return new Meal("Brown Rice & Veggies", 350, "Week");
            default: return null;
        }
    }

    // Add meal to weekly tracker
    public void addMeal(Meal meal) {
        weeklyMeals.add(meal);
    }

    // Calculate total calories for the week
    public int getTotalWeeklyCalories() {
        int total = 0;
        for (Meal m : weeklyMeals) {
            total += m.getCalories();
        }
        return total;
    }

    // Compare total calories to goal
    public String compareToGoal() {
        int total = getTotalWeeklyCalories();
        if (total < weeklyCalorieGoal) {
            return "You stayed UNDER your weekly calorie goal!";
        } else if (total == weeklyCalorieGoal) {
            return "You hit your goal EXACTLY!";
        } else {
            return "You went OVER your weekly calorie goal.";
        }
    }

    // Print all meals chosen
    public void printWeeklyMeals() {
        System.out.println("\nMeals you chose this week:");
        for (Meal m : weeklyMeals) {
            System.out.println(m.getMealName() + " - " + m.getCalories() + " calories");
        }
    }
}
