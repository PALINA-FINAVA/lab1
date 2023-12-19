package bsu.rfct.course2.java.finova.lab1.varB11;

public class Apple extends Food {
    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple) arg0).size);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

    public int calculateCalories() {
        if (!size.isEmpty()) {
            if (size.equals("Большое")) {
                return 150;
            } else if (size.equals("Среднее")) {
                return 120;
            } else if (size.equals("Маленькое")) {
                return 90;
            }

        } else return 0;
        return 0;

    }
}

