import java.util.ArrayList;

public class NutritionManager {
    private User user;
    private ArrayList<Meal> meals;

    public NutritionManager(User user) {
        this.user = user;
        this.meals = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public int getDailyCalories(String date) {
        int total = 0;
        for (Meal m : meals) {
            if (m.getDate().equals(date)) {
                total += m.getCalories();
            }
        }
        return total;
    }

    public void setCalorieGoal(int newGoal) {
        user.setCalorieGoal(newGoal);
    }

    public ArrayList<Meal> getAllMeals() {
        return meals;
    }

    public User getUser() {
        return user;
    }

    // ⭐ Sprint 3 Day 1: get meals for a specific date
    public ArrayList<Meal> getMealsByDate(String date) {
        ArrayList<Meal> mealsForDate = new ArrayList<>();
        for (Meal m : meals) {
            if (m.getDate().equals(date)) {
                mealsForDate.add(m);
            }
        }
        return mealsForDate;
    }

    // ⭐ Sprint 3 Day 2: basic daily summary
    public String getDailySummary(String date) {
        int total = getDailyCalories(date);
        return "Summary for " + date + ": " + total + " calories consumed.";
    }

    // ⭐ Sprint 3 Day 3: print meals for a specific date
    public void printMealsByDate(String date) {
        ArrayList<Meal> mealsForDate = getMealsByDate(date);
        System.out.println("Meals for " + date + ":");
        for (Meal m : mealsForDate) {
            System.out.println(m);
        }
    }
}
