package main_task.utility_classes_with_calculations_etc;

public class Vegetables {
    private String name;
    private int calories;

    public Vegetables(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
