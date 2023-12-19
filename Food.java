package bsu.rfct.course2.java.finova.lab1.varB11;
public class Food implements Consumable,Nutritious {
    String name = null;
    private int calories;
    private int quantity;
    public Food(String name) {
        this.name = name;
    }
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false; // если объект не экземпляр класса или подкласса
        if (name==null || ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name);
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public  void consume(){

    };
    @Override
    public  int  calculateCalories(){
        return calories;
    };
}
