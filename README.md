# Weekly Health Tracker

A simple Java console app that helps a user choose healthy meals for the week, record them, and compare the total calories against a weekly goal.

## What this software does

The program allows a user to:
- enter a weekly calorie goal
- choose meals from a healthy menu
- add those meals to a weekly log
- view the total weekly calories
- see whether the weekly goal was met, exceeded, or under the goal

## Who it’s for

This health tracker is for a user who wants a quick, menu-based way to track healthy meal choices and compare weekly calories against a target.

## How to run the program

1. Open a terminal in the project folder.
2. Compile the Java files:
   `javac src/*.java`
3. Run the program:
   `java -cp src Main`
4. Enter a weekly calorie goal when prompted.
5. Select meals by number, then choose whether to add more meals.
6. View the weekly meal summary and goal comparison.

## Technical overview

### Main classes
- `Main` — starts the program, reads user input, and controls meal entry.
- `HealthTracker` — stores weekly meals, shows menu options, creates meals from the selected choice, calculates total calories, and compares totals to the goal.
- `Meal` — represents a food item with a name, calorie count, and a date label.

### Class diagram
```
Main
  + main(String[] args)
      |
      v
HealthTracker
  - ArrayList<Meal> weeklyMeals
  - int weeklyCalorieGoal
  + showHealthyOptions()
  + createMealFromChoice(int): Meal
  + addMeal(Meal)
  + getTotalWeeklyCalories(): int
  + compareToGoal(): String
  + printWeeklyMeals()
      |
      v
Meal
  - String mealName
  - int calories
  - String date
  + getMealName(): String
  + getCalories(): int
  + getDate(): String
  + toString(): String
```

### Key data structures and logic
- `ArrayList<Meal>` in `HealthTracker` stores all meals added during the current run.
- The meal menu is mapped to `Meal` objects inside `HealthTracker.createMealFromChoice(int)`.
- Total calories are calculated by summing calories from all recorded meals.
- The program reports whether the user stayed under, hit, or exceeded the weekly goal.

## Known limitations / future improvements

- The program does not store meal history between runs.
- Meal date tracking is present in the `Meal` class but not fully used.
- Future improvements could include:
  - adding a real date for each meal
  - saving weekly logs to a file
  - allowing custom meal entries instead of a fixed menu
  - using a graphical interface or a more interactive menu

## Files included
- `src/Main.java`
- `src/HealthTracker.java`
- `src/Meal.java`

## Notes

This README is based on the current state of the project files and describes the existing weekly health tracking functionality.
