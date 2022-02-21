package main_task.utility_classes_with_calculations_etc;

import main_task.ingredients.*;

public class SaladAction {
    public static void main(String[] args) {
        Carrot carrot = new Carrot("Carrot", 35);
        Tomato tomato = new Tomato("Tomato", 20);
        Corn corn = new Corn("Corn", 125);
        Cucumber cucumber = new Cucumber("Cucumber", 15);
        Meat meat = new Meat("Chicken", 250);
        Potato potato = new Potato("Potato", 80);

        SaladCalculations saladCalculations = new SaladCalculations();

        saladCalculations.salad.add(carrot);
        saladCalculations.salad.add(tomato);
        saladCalculations.salad.add(corn);
        saladCalculations.salad.add(cucumber);
        saladCalculations.salad.add(meat);
        saladCalculations.salad.add(potato);


        System.out.println("The salad contains: ");
        saladCalculations.showSaladContent();
        System.out.println("");
        System.out.println("The amount of calories in the salad: ");
        saladCalculations.calculateCaloriesAmount();
        System.out.println("");
        System.out.println("Sorted vegetables by caloric content: ");
        saladCalculations.sortVegetables();
        System.out.println("");
        System.out.println("Find vegetables in the salad that correspond to a given range of calories: ");
        saladCalculations.findVegetablesOfCertainCaloricContent(0,50);
    }
}
