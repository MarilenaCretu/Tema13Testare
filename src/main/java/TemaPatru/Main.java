package TemaPatru;


public class Main {
    public static void main(String[] args) {
        LogicalOp logicalOp = new LogicalOp();
        System.out.println("\nnu e gata");
        int [] array = new int [] {56, 3, 90, 5, 98};
        logicalOp.printArrayValue(array);
        logicalOp.min(array);
        logicalOp.max(array);


    }

}
