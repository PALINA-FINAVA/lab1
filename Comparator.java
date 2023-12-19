package bsu.rfct.course2.java.finova.lab1.varB11;

import java.util.Comparator;
class ComparatorFood implements Comparator<Food> {
    public int compare(Food arg0, Food arg1) {

        if (arg0==null) return 1;
        if (arg1==null) return -1;
        return arg0.getName().compareTo(arg1.getName());
    }
}
