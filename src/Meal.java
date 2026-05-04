public class Meal {
    private String mealName;
    private int calories;
    private String date; // not used heavily now, but kept for structure

    public Meal(String mealName, int calories, String date) {
        this.mealName = mealName;
        this.calories = calories;
        this.date = date;
    }

    public String getMealName() {
        return mealName;
    }

    public int getCalories() {
        return calories;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return mealName + " - " + calories + " cal";
    }
}
