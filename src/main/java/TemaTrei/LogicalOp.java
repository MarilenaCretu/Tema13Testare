package TemaTrei;

public class LogicalOp {

    //Exerecitiul 2
    public int[] getIndexForArray(int index) {
        int[] myArray = new int[index];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            System.out.print(myArray[i] + " ");
        }
        return myArray;
    }

    //Exerecitiul 3
    public void printArrayValue(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

    //Exerecitiul 4
    public void mediaArrayValue(int[] myArray) {
        int sun = 0;
        double media = 0;
        for (int i = 0; i < myArray.length; i++) {
            sun += myArray[i];
        }
        media = (double) sun / myArray.length;
        System.out.println(media);
    }
//Exercitiul 5
// -----

    //Exerecitiul 6
    public int getIndexForValue(int[] myArray, int value) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == value) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("-- Valoarea nu exista in array --");
        return -1;
    }

    //Exerecitiul 7
    public void getGrila() {
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
        System.out.println(" - - - - - - - - - -");
    }

//Exerecitiul 8
//------

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
