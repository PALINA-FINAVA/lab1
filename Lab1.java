package bsu.rfct.course2.java.finova.lab1.varB11;

import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) throws Exception {

        Food[] breakfast = new Food[20];
        boolean countCalories = false;
        boolean doSort = false;

        int itemsSoFar = 0;

        for (String arg : args) {
            if (arg.startsWith("-")) {
                if (arg.equals("-calories")) {
                    countCalories = true;
                } else if (arg.startsWith("-sort")) {
                    doSort = true;
                }

            } else {
                String[] parts = arg.split("/");
                switch (parts[0]) {
                    case "Cheese" -> breakfast[itemsSoFar] = new Cheese();
                    case "Cake" -> breakfast[itemsSoFar] = new Cake(parts[1]);
                    case "Apple" -> breakfast[itemsSoFar] = new Apple(parts[1]);
                }
                itemsSoFar++;
            }
        }

        for (Food item : breakfast)
            if (item != null)
                item.consume();
            else
                break;

        for (Food item : breakfast)
            if (item != null)
            item.calculateCalories();
        else
                break;

        if (countCalories) {
            int sum = 0;
            for (Food item : breakfast) {
                if (item != null) {
                    sum += item.calculateCalories();
                } else break;
            }
            System.out.println("Всего калорий: " + sum);
        }

        if (doSort) {
            Arrays.sort(breakfast, new ComparatorFood());
            for (Food food : breakfast) {
                if (food == null) break;
                food.consume();
            }

            int cakeSearching = 0;
            Cake cakeSearch = new Cake("Шоколадная");
            for (Food cake : breakfast) {
                if (cake instanceof Cake) {
                    if ((cake).equals(cakeSearch)) {
                        cakeSearching++;
                    }
                }
            }
            System.out.println("количество " + cakeSearch + " всего " + cakeSearching);


            System.out.println("Всего хорошего!");
    }
}
}