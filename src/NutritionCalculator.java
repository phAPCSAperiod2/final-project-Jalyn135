import java.util.ArrayList;

public class NutritionCalculator {

    public static int calculateTotalCalories(ArrayList<Meal> meals) {
        int total = 0;
        for (Meal m : meals) {
            total += m.getCalories();
        }
        return total;
    }

    public static String compareToGoal(int totalCalories, int goal) {
        if (totalCalories < goal) {
            return "Under goal";
        } else if (totalCalories == goal) {
            return "Exactly at goal";
        } else {
            return "Over goal";
        }
    }
}
