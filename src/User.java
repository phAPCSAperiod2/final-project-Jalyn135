public class User {
    private String name;
    private int calorieGoal;
    private double weight;

    public User(String name, int calorieGoal, double weight) {
        this.name = name;
        this.calorieGoal = calorieGoal;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getCalorieGoal() {
        return calorieGoal;
    }

    public double getWeight() {
        return weight;
    }

    public void setCalorieGoal(int calorieGoal) {
        this.calorieGoal = calorieGoal;
    }

    public void updateWeight(double newWeight) {
        this.weight = newWeight;
    }
}
