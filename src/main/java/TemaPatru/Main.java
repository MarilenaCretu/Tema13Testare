package TemaPatru;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LogicalOp logicalOp = new LogicalOp();
        System.out.println("Exercitiul 1:\n\tCreati o metoda care insereze un element pe o pozitie specifica intr-un array:");
        int [] array = new int [] {56, 3, 90, 5, 98};
        logicalOp.printArrayValue(array);
        System.out.println("\n\nExercitiul 2:\n\tCreati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array:");
        System.out.print("Cel mai mic numar din array este: ");
        logicalOp.minim(array);
        System.out.print("Cel mai mare numar din array este: ");
        logicalOp.maxim(array);
        System.out.println("\nExercitiul 3:\n\tCreati o metoda care sa inverseze valorile unui array de int-uri:");
        System.out.print("Array initial: ");
        logicalOp.printArrayValue(array);
        Arrays.sort(array,2,4);
        System.out.println("\nInversare Array:" + Arrays.toString(array));
        System.out.println("\nExercitiul 6:\n\tCreati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator:");
        System.out.print("Array initial: ");
        logicalOp.printArrayValue(array);
        Arrays.sort(array);
        System.out.println("\nOrdonare Array:" + Arrays.toString(array));

    }

}
