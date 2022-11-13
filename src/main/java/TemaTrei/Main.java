package TemaTrei;

public class Main {
    public static void main(String[] args) {

        LogicalOp logicalOp = new LogicalOp();
        System.out.println("Exercitiul 2:\n\tCreati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100:");
        int[] myArray = logicalOp.getIndexForArray(100);
        //logicalOp.getIndexForArray(100);
        System.out.println("\n\nExercitiul 3:\n\tCreati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100:");
        logicalOp.printArrayValue(myArray);
        System.out.println("\n\nExercitiul 4:\n\tCreati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda sa calculeze si sa returneze\n" +
                "media numerelor din array:");
        logicalOp.mediaArrayValue(myArray);
//        System.out.println("\nExercitiul 5:\n\tCreati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String. Metoda sa\n" +
//                "verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false:");
        System.out.println("\nExercitiul 6:\n\tCreati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa\n" +
                "verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul:");
        logicalOp.getIndexForValue(myArray, 50);
        System.out.println("\nExercitiul 7:\n\tCreati o metoda care sa afiseze urmatoarea grila, folosind un array:");
        logicalOp.getGrila();
//        System.out.println("\nExercitiul 8:\n\tCreati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa\n" +
//                "verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar:");

        //nu e asa in tema
        System.out.println("\nnu e asa in tema");
        int [] array = new int [] {56, 3, 90, 5, 98};
        logicalOp.printArrayValue(array);
        logicalOp.min(array);
        logicalOp.max(array);

    }
}