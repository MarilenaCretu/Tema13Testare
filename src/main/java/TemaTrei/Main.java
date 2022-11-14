package TemaTrei;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LogicalOp logicalOp = new LogicalOp();
        System.out.println("Exercitiul 2:\n\tCreati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100:");
        int[] myArray = new int[100];
        logicalOp.getArray(myArray);
        System.out.println("\n\nExercitiul 3:\n\tCreati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100:");
        logicalOp.printArrayValue(myArray);
        System.out.println("\n\nExercitiul 4:\n\tCreati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda sa calculeze si sa returneze\n" +
                "media numerelor din array:");
        logicalOp.mediaArrayValue(myArray);
        System.out.println("\nExercitiul 5:\n\tCreati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String. Metoda sa\n" +
                "verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false:");
        String[] arrString = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};
        System.out.print("Array dat: "+ Arrays.asList(arrString)+"\n");
        logicalOp.checkarrArray(arrString, "Joi");
        System.out.println("\nExercitiul 6:\n\tCreati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa\n" +
                "verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul:");
        int [] indexArray = new int [] {56, 3, 50, 5, 98};
        System.out.print("Array dat: "+ Arrays.toString(indexArray));
        logicalOp.getIndexForValue(indexArray, 50);
        System.out.println("\nExercitiul 7:\n\tCreati o metoda care sa afiseze urmatoarea grila, folosind un array:");
        logicalOp.getGrila();
        System.out.println("\nExercitiul 8:\n\tCreati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa\n" +
                "verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar:");
        logicalOp.removeNrFromArray(indexArray, 3);
        System.out.println("\nExercitiul 9:\n\tCreati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array: ");
        int [] micArray = new int [] {56, 3, 50, 5, 98};
        System.out.print("Array dat: "+ Arrays.toString(micArray));
        System.out.print("\nAl doilea cel mai mic numar din array este: ");
        logicalOp.aldoileamicArray(micArray);

    }
}