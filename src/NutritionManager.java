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
}
