package src;

public class Planta {

    private int age;
    private int value;
    public String name;
    public double inaltime;

    public Planta(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Planta(int age, String name, int value) {
        this.age = age;
        this.name = name;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setAge(int value) {
        this.value = value;
    }

    public int getAge() {
        return value;
    }

    public boolean isInGoodShape() {
        if (age > 15 && inaltime < 50)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return ("Gradina:" + this.value + this.inaltime);
    }

}