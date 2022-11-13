package TemaPatru;

public class LogicalOp {

    public void printArrayValue(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

    public int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                System.out.println("\n" + min);
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        return max;
    }
}
