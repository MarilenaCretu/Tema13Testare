package TemaPatru;

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


    }

}
