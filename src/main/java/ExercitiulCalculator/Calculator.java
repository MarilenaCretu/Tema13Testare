import java.util.Scanner;

public class Calculator {
    static String calcul = "Calcul";

    int ex;

    public int getEx() {
        return ++ex;
    }

    String exercitiul;

    public String getExercitiul() {
        return "Exercitiul ";
    }

    int tema;

    public int getTema() {
        return ++tema;
    }

    int primmulnumar;

    public int getPrimmulnumar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int a = s.nextInt();
        return primmulnumar = a;
    }

    int aldoileanumar;

    public int getAldoileanumar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti al doilea numar: ");
        int b = s.nextInt();
        return aldoileanumar = b;
    }

    String exercitiulunu;

    public String getExercitiulunu() {
        System.out.println("Tema " + getEx() + "\n" + getExercitiul() + getTema() + ": Printati \"Hello\" in consola, iar pe rand nou, printati numele vostru.");
        return "Hello\nMarilena\n";
    }

    String afisarecerintadoi;

    public String getAfisarecerintadoi() {
        return getExercitiul() + getTema() + ": Printati rezultatul sumei a doua numere(orice numere)";
    }

    String exercitiuldoi;

    public String getExercitiuldoi() {
        int sum = primmulnumar + aldoileanumar;
        return "Suma numerelor pe care le-ati introdus (" + primmulnumar + ", " + aldoileanumar + ") este: " + sum + "\n";
    }

    String exercitiultrei;

    public String getExercitiultrei() {
        System.out.println(getExercitiul() + getTema() + ": Printati rezultatul impartirii a doua numere.\n" +
                "Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.");
        double impartit = (double) primmulnumar / aldoileanumar;
        return "\tRezultatul pentru numerele pe care le-ati introdus (" + primmulnumar + ", " + aldoileanumar + ") este: " + impartit + "\n";
    }

    String calculD;

    public String getCalculD() {
        double m = 5;
        double n = 15;
        double o = 3;
        double p = 2;
        double r = 8;
        double s = 3;
        double calculD = m + n / o * p - r % s;
        return "\t" + calcul + "D: 5 + 15 / 3 * 2 - 8 % 3 = " + calculD;
    }

    String calculC;

    public String getCalculC() {
        double i = 20;
        double j = -3;
        double k = 5;
        double l = 8;
        double calculC = i + j * k / l;
        return "\t" + calcul + "C: 20 + -3*5 / 8 = " + calculC;
    }

    String calculB;

    public String getCalculB() {
        int f = 55;
        int g = 9;
        int h = 9;
        int calculB = (f + g) % h;
        return "\t" + calcul + "B: (55+9) % 9 = " + calculB;
    }


    String calculA;

    public String getCalculA() {
        System.out.println(getExercitiul() + getTema() + ": Printati rezultatul urmatoarelor operatiuni:");
        double c = -5;
        double d = 8;
        double e = 6;
        double calA = c + d * e;
        return "\t" + calcul + "A: -5 + 8 * 6 = " + calA;
    }

    //exercitiul 9
    String distanta;

    public String getDistanta() {
        System.out.println("\n" + getEx() + " Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.");
        Scanner d = new Scanner(System.in);
        System.out.println("Introduceti distanta: ");
        int distanta = d.nextInt();
        System.out.println("Introduceti nr. ore: ");
        int ore = d.nextInt();
        System.out.println("Introduceti nr. minute: ");
        int minute = d.nextInt();
        System.out.println("Introduceti nr. secunde: ");
        int secunde = d.nextInt();

        System.out.println("Pentru distanta: " + distanta + " metri,\n parcursa in: " + ore + " ore " + minute + " minute " + secunde + " secunde ");

        int totsecunde=((ore * 3600)+(minute*60)+secunde);
        double mpes=(double)distanta/totsecunde;
        System.out.println("Viteza, in metri pe secunda: " + mpes);

        double kpeo = (double) (distanta*3600) / (totsecunde*1000);
        System.out.println("Viteza, in kilometri pe ora: " + kpeo);

        double mpeo = (kpeo/1609)*1000;
        return "Viteza, in mile pe ora: " + mpeo;
    }

    //exercitiul 8
    String metri;

    public String getMetri() {
        System.out.println("\n" + getEx() + " Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metri");
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti distanta in inch: ");
        double inch = s.nextInt();
        double metri = inch * 2.54 / 100;
        return "Dinstanta in metri pentru " + inch + " inch este: " + metri;
    }

    //exercitiul 7
    String temperatura;

    public String getTemperatura() {
        System.out.println("\n" + getEx() + " Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.");
        Scanner f = new Scanner(System.in);
        System.out.println("Introduceti temperatura in Fahrenheit: ");
        double fahrenheit = f.nextDouble();
        System.out.println(fahrenheit);
        double celsius = (fahrenheit - 32) * 5 / 9;
        return "Temperatura in Celsius este: " + celsius;
    }

    //exercitiul 6
    String restulimpartirii;

    public String getRestulimpartirii() {
        System.out.println("\n" + getEx() + " Scrieti o metoda java, care sa returneze restul impartirii a doua numere:");
        double rest = primmulnumar % aldoileanumar;
        return "Rezultatul pentru numerele pe care le-ati introdus (" + primmulnumar + ", " + aldoileanumar + ") este: " + rest;
    }

    //exercitiul 5
    String modelfata;

    public String getModelfata() {
        System.out.println("\n" + getEx() + " Scrieti o metoda java, care sa afiseze urmatorul model:");
        System.out.println("   +\"\"\"\"\"+");
        System.out.println(" [ | o o | ]");
        System.out.println("   |  ^  |");
        System.out.println("   | '_' |");
        return "   +-----+";
    }

    //exercitiul 4
    String media;

    public String getMedia() {
        System.out.println("\n" + getEx() + " Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.");
        int c = aldoileanumar + 1;
        double medie = (double) (primmulnumar + aldoileanumar + c) / 3;
        return "Rezultatul pentru numerele pe care le-ati introdus (" + primmulnumar + ", " + aldoileanumar + ", " + c + ") este: " + medie + "\n";
    }

    //exercitiul 3
    String java;

    public String getJava() {
        System.out.println("\n" + getEx() + " Scrieti o metoda java, care sa afiseze urmatorul model:");
        System.out.println("   J    a   V     V   a");
        System.out.println("   J   a a   V   V   a a");
        System.out.println("J  J  aaaaa   V V   aaaaa");
        return " JJ  a     a   V   a     a";
    }

    //exercitiul 2
    String impartirea;

    public String getImpartirea() {
        double impartit = (double) primmulnumar / aldoileanumar;
        return "Rezultatul impartirii numerelor pe care le-ati introdus (" + primmulnumar + ", " + aldoileanumar + ") este: " + impartit;
    }

    String inmultirea;

    public String getInmultirea() {
        double inmultit = (double) primmulnumar * aldoileanumar;
        return "Rezultatul inmultirii numerelor pe care le-ati introdus (" + primmulnumar + ", " + aldoileanumar + ") este: " + inmultit;
    }

    String scaderea;

    public String getScaderea() {
        double scadere = (double) primmulnumar - aldoileanumar;
        return "Rezultatul scaderii numerelor pe care le-ati introdus (" + primmulnumar + ", " + aldoileanumar + ") este: " + scadere;
    }

    String suma;

    public String getSuma() {
        System.out.println("\nTema  " + getEx() + "\n" + ex + " Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.");
        int sum = primmulnumar + aldoileanumar;
        return "Rezultatul adunarii numerelor pe care le-ati introdus (" + primmulnumar + ", " + aldoileanumar + ") este: " + sum;
    }
}
