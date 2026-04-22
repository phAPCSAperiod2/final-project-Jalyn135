public class Meal {
    private String mealName;
    private int calories;
    private String date; // simple String for now (e.g., "2026-04-15")

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
        return mealName + " - " + calories + " cal on " + date;
    }
}
