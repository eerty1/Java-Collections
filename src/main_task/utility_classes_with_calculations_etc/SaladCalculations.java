package main_task.utility_classes_with_calculations_etc;

import java.util.Collections;
import java.util.LinkedList;

public class SaladCalculations {
    LinkedList<Vegetables> salad = new LinkedList<>();
    SaladComparator saladComparator = new SaladComparator();

    public void showSaladContent () {
        for (Vegetables saladContent : salad) {
            System.out.println(saladContent.toString());
        }
    }

    public void calculateCaloriesAmount () {
        int caloriesAmount = 0;
        for (Vegetables calories : salad) {
            caloriesAmount += calories.getCalories();
        }
        System.out.println(caloriesAmount);
    }

    public void sortVegetables () {
        Collections.sort(salad, saladComparator);
        for (Vegetables sorting : salad) {
            System.out.println(sorting.toString());
        }
    }

    public void findVegetablesOfCertainCaloricContent (int lowerLimit, int upperLimit) {
        for(Vegetables caloricContent : salad) {
            if (caloricContent.getCalories() >= lowerLimit && caloricContent.getCalories() <= upperLimit) {
                System.out.println(caloricContent.toString());
            }
        }
    }
}
