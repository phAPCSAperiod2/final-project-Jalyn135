import java.util.ArrayList;

/**
 * Tracks a user's weekly meals and compares total calories against a weekly
 * goal.
 */
public class HealthTracker {

    /** The meals added for the current week. */
    private ArrayList<Meal> weeklyMeals = new ArrayList<>();

    /** The target calorie goal for the week. */
    private int weeklyCalorieGoal;

    /**
     * Creates a new health tracker with the given weekly calorie goal.
     *
     * @param weeklyCalorieGoal the calorie goal for the week
     */
    public HealthTracker(int weeklyCalorieGoal) {
        this.weeklyCalorieGoal = weeklyCalorieGoal;
    }

    /**
     * Prints a list of healthy meal options to the console.
     */
    public void showHealthyOptions() {
        System.out.println("\nChoose a meal from the list below:");
        System.out.println("1. Grilled Chicken - 400 calories");
        System.out.println("2. Oatmeal - 300 calories");
        System.out.println("3. Salad - 250 calories");
        System.out.println("4. Fruit Bowl - 150 calories");
        System.out.println("5. Smoothie - 200 calories");
        System.out.println("6. Brown Rice & Veggies - 350 calories");
        System.out.println("7. Grilled Salmon - 350 calories");
        System.out.println("8. Greek Yogurt Parfait - 250 calories");
        System.out.println("9. Sweet Potato - 200 calories");
        System.out.println("10. Chicken Stir Fry - 400 calories");
        System.out.println("11. Quinoa Bowl - 320 calories");
        System.out.println("12. Baked Tofu - 280 calories");
        System.out.println("13. Turkey Sandwich - 350 calories");
        System.out.println("14. Green Smoothie - 220 calories");
        System.out.println("15. Lentil Soup - 280 calories");
        System.out.println("16. Roasted Vegetables - 180 calories");
    }

    /**
     * Converts a numeric menu choice into a {@link Meal} object.
     *
     * @param choice the meal number selected by the user
     * @return a Meal corresponding to the choice, or null if the choice is invalid
     */
    public Meal createMealFromChoice(int choice) {
        switch (choice) {
            case 1:
                return new Meal("Grilled Chicken", 400, "Week");
            case 2:
                return new Meal("Oatmeal", 300, "Week");
            case 3:
                return new Meal("Salad", 250, "Week");
            case 4:
                return new Meal("Fruit Bowl", 150, "Week");
            case 5:
                return new Meal("Smoothie", 200, "Week");
            case 6:
                return new Meal("Brown Rice & Veggies", 350, "Week");
            case 7:
                return new Meal("Grilled Salmon", 350, "Week");
            case 8:
                return new Meal("Greek Yogurt Parfait", 250, "Week");
            case 9:
                return new Meal("Sweet Potato", 200, "Week");
            case 10:
                return new Meal("Chicken Stir Fry", 400, "Week");
            case 11:
                return new Meal("Quinoa Bowl", 320, "Week");
            case 12:
                return new Meal("Baked Tofu", 280, "Week");
            case 13:
                return new Meal("Turkey Sandwich", 350, "Week");
            case 14:
                return new Meal("Green Smoothie", 220, "Week");
            case 15:
                return new Meal("Lentil Soup", 280, "Week");
            case 16:
                return new Meal("Roasted Vegetables", 180, "Week");
            default:
                return null;
        }
    }

    /**
     * Adds a meal to the weekly meal tracker.
     *
     * @param meal the meal to add
     */
    public void addMeal(Meal meal) {
        weeklyMeals.add(meal);
    }

    /**
     * Calculates the total number of calories consumed this week.
     *
     * @return the sum of calories for all recorded weekly meals
     */
    public int getTotalWeeklyCalories() {
        int total = 0;
        for (Meal m : weeklyMeals) {
            total += m.getCalories();
        }
        return total;
    }

    /**
     * Compares the weekly calorie total against the goal and returns a summary
     * message.
     *
     * @return a message indicating whether the goal was met, exceeded, or undercut
     */
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

    /**
     * Prints the names and calorie counts of all meals recorded for the week.
     */
    public void printWeeklyMeals() {
        System.out.println("\nMeals you chose this week:");
        for (Meal m : weeklyMeals) {
            System.out.println(m.getMealName() + " - " + m.getCalories() + " calories");
        }
    }
}
