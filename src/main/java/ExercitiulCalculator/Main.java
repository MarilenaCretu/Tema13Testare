package ExercitiulCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.adunint(3,2));
        System.out.println(calculator.adunfloat(3.5F, 5.2f,2));
        System.out.println(calculator.adundouble(3.5,5.2));
        System.out.println(calculator.rezultatulimpartirii(2,7.3));

        System.out.println(calculator.calculA(-5, 8 , 6));
        System.out.println(calculator.calculA(-5D, 8D , 6));
        System.out.println(calculator.calcula(-5,8,6));

        System.out.println(calculator.calculB(55,9,9));
        System.out.println(calculator.calculB(55D,9D,9));

        System.out.println(calculator.calculC(20D,-3D,5D ,8D));
        System.out.println(calculator.calculC(20,-3,5.0,8));

        System.out.println(calculator.calculD(5.0, 15.0,3.0,2.0,8.0,3.0));
        System.out.println(calculator.calculD(5.0, 15,3,2,8,3));
        System.out.println(calculator.calculD(5,15,3,2,8,3));

        System.out.println(calculator.impartirea(8,4));
        System.out.println(calculator.impartirea(14.2,3.7));
        System.out.println(calculator.impartirea(14,3.3));
        System.out.println(calculator.inmultirea(7,6));
        System.out.println(calculator.inmultirea(5D,7D));
        System.out.println(calculator.inmultirea3(5.7F,4.9F,2));

        System.out.println(calculator.scaderea(5.7,4.9,2.0));
        System.out.println(calculator.scaderea(5,4,2.7));

        System.out.println(calculator.suma(5.7D,4.9D,2D));


        // Vechi //

//        System.out.println(calculator.getExercitiulunu());
//        System.out.println(calculator.getAfisarecerintadoi());
//        System.out.println(calculator.getPrimmulnumar());
//        System.out.println(calculator.getAldoileanumar());
//        System.out.println(calculator.getExercitiuldoi());
//
//        System.out.println(calculator.getExercitiultrei());
//
//        System.out.println(calculator.getCalculA());
//        System.out.println(calculator.getCalculB());
//        System.out.println(calculator.getCalculC());
//        System.out.println(calculator.getCalculD());
//
//        System.out.println(calculator.getSuma());
//        System.out.println(calculator.getScaderea());
//        System.out.println(calculator.getInmultirea());
//        System.out.println(calculator.getImpartirea());
//
//        System.out.println(calculator.getJava());
//        System.out.println(calculator.getMedia());
//        System.out.println(calculator.getModelfata());
//        System.out.println(calculator.getRestulimpartirii());
//        System.out.println(calculator.getTemperatura());
//        System.out.println(calculator.getMetri());
//        System.out.println(calculator.getDistanta());
    }
}
