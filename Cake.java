package bsu.rfct.course2.java.finova.lab1.varB11;
public class Cake extends Food {
    private String icing;
    public Cake(String icing) {
        super("Торт");
        this.icing = icing;
    }
    public void consume() {
        System.out.println(this + " съеден");
    }
    public String getIcing() {
        return icing;
    }
    public void setIcing(String icing) {
        this.icing = icing;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Cake)) return false;
            return icing.equals(((Cake)arg0).icing);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " с глазурью '" + icing.toUpperCase() + "'";
    }

    public int calculateCalories() {
        if (!icing.isEmpty()) {
            if (icing.equals("Шоколадная")) {
                return 200;
            } else if (icing.equals("Сливочная")) {
                return 150;
            } else if (icing.equals("Карамель")) {
                return 120;
            }

        } else return 80;
        return 0;
    }


}
