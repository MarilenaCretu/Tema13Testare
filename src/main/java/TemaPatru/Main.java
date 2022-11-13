package TemaPatru;


public class Main {
    public static void main(String[] args) {
        LogicalOp logicalOp = new LogicalOp();
        System.out.println("\nExercitiul 2:\n\tCreati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array:");
        int [] array = new int [] {56, 3, 90, 5, 98};
        logicalOp.printArrayValue(array);
        System.out.println("\nCel mai mic numar din array este:");
        logicalOp.min(array);
        System.out.println("Cel mai mare numar din array este:");
        logicalOp.max(array);


    }

}
