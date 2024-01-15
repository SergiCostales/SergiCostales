package javaapplication36;

import java.util.Scanner;

public class FeaTure {

    public static double introNum() {
        Scanner sc = new Scanner(System.in);
        String numero1;
        double n1 = 0;
        do {
            System.out.println("\n Introduce el segundo numero. ");
            numero1 = sc.nextLine();
        } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
        return Double.parseDouble(numero1);
    }
    public static double introSegundoNum(){
        Scanner sc = new Scanner(System.in);
        String numero2;
        double n2 = 0;
            do {
                System.out.println("\n Introduce el segundo numero.");
                numero2 = sc.nextLine();
            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
            n2 = Double.parseDouble(numero2);
        return 0;
        
    
    }

}
