package src;

import java.util.*;

public class Gradina {
    public int size;
    public String name;
    private int value;
    private String helper;

    private Planta planta = new Planta(3, "cartof", 10);
    private List<Planta> plants = new ArrayList<Planta>();

    public Gradina(int size, int value) {
        this.size = size;
        this.value = value;
    }

    public Gradina(int size, int value, String name) {
        this(size, value);
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setHelper(String value) {
        this.helper = value;
    }

    public String getHelper() {
        return helper;
    }

    public void showSize() {
        System.out.println(size != 0 ? size : "doesnt have a size");
    }

    public void setValueForTheLongestPlant(int value) {
        int max = 0;
        Planta plantaVeche = null;
        for (Planta planta : plants) {
            if (planta.getValue() > max) {
                plantaVeche = planta;
                max = planta.getValue();
            }
        }
        if (plantaVeche != null)
            plantaVeche.setValue(value);
    }

    public void getProfitOnPlant() {
        final int ageOfPlant = planta.getAge();
        if (ageOfPlant > 10) {
            System.out.println(value * 50 / 100);
        } else if (ageOfPlant > 5)
            System.out.println(value * 30 / 100);
        else
            System.out.println(value * 20 / 100);

    }

    public boolean checkPlants() {
        for (Planta planta : plants) {
            if (!planta.isInGoodShape())
                return false;
        }
        return true;
    }

    public void createPlant(int age, String name) {
        final Planta newPlant = new Planta(age, name);
        plants.add(newPlant);
    }

    @Override
    public String toString() {
        return ("Gradina:" + this.size + this.name);
    }

}