package main_task.utility_classes_with_calculations_etc;

import java.util.Comparator;


public class SaladComparator implements Comparator<Vegetables> {


    @Override
    public int compare(Vegetables o1, Vegetables o2) {
        if (o1.getCalories() > o2.getCalories()) {
            return 1;
        } else if (o1.getCalories() < o2.getCalories()) {
            return -1;
        } else {
            return 0;
        }
    }
}