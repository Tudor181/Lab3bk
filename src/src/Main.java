package src;

import pachet.Floare;

public class Main {
    public static void main(String args[]) {
        Gradina gradina = new Gradina(0, 0);
        gradina.createPlant(10, "ceapa");
        gradina.getProfitOnPlant();
        final boolean healthyPlants = gradina.checkPlants();
        System.out.println(healthyPlants);
        gradina.toString();
        // planta nu avem decat in gradina;
        // Floare floare = new Floare();
        Floare.print();
        Floare.print();
    }
}