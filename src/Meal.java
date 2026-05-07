/**
 * Represents a food item with a name, calorie count, and date information.
 */
public class Meal {
    private String mealName;
    private int calories;
    private String date; // not used heavily now, but kept for structure

    /**
     * Constructs a Meal with a name, calories, and date label.
     *
     * @param mealName the name of the meal
     * @param calories the number of calories in the meal
     * @param date     the date or label for the meal entry
     */
    public Meal(String mealName, int calories, String date) {
        this.mealName = mealName;
        this.calories = calories;
        this.date = date;
    }

    /**
     * Returns the meal name.
     *
     * @return the name of the meal
     */
    public String getMealName() {
        return mealName;
    }

    /**
     * Returns the calorie count for the meal.
     *
     * @return the meal calories
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Returns the date label for this meal.
     *
     * @return the meal date or label
     */
    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return mealName + " - " + calories + " cal";
    }
}
