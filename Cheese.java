package bsu.rfct.course2.java.finova.lab1.varB11;

public class Cheese extends Food {
    public Cheese() {
        super("Сыр");
    }
    public void consume() {
        System.out.println(this + " съеден");
    }

    public int calculateCalories() {
        return 200;
    }
}