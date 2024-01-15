package javaapplication36;

import java.util.Scanner;

public class BugFix {

    public static double BugFix(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        String operacion;
        boolean comprobar;
        double n1;

        do {
            String numero1;
            n1 = FeaTure.introNum();
            do {
                System.out.println("\n Introduce el primer numero. ");
                numero1 = sc.nextLine();
            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
             n1 = Double.parseDouble(numero1);

            do {
                System.out.println("\n Operación? (Indica el signo)");
                System.out.println("+ = sumar \n - = restar \n"
                        + " x = multiplicar \n / = dividir \n * = elevar primer num al segundo num."
                        + "\n % = residuo");
                operacion = sc.nextLine();
                comprobar = operacion.matches("[+\\-xX/*%]");
            } while (!comprobar);

            String numero2;
            double n2 = FeaTure.introSegundoNum();
            do {
                System.out.println("\n Introduce el segundo numero.");
                numero2 = sc.nextLine();
            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
            n2 = Double.parseDouble(numero2);

            switch (operacion) {
                case "+":
                    res = n1 + n2;
                    break;
                case "-":
                    res = n1 - n2;
                    break;
                case "x":
                case "X":
                    res = n1 * n2;
                    break;
                case "/":
                    while (n2 == 0) {
                        do {
                            System.err.println(" Al denominador hay un cero \n"
                                    + "para evitar errores coloca otro valor.");
                            numero2 = sc.nextLine();
                        } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                        n2 = Double.parseDouble(numero2);
                    }
                    res = n1 / n2;
                    break;
                case "*":
                    res = Math.pow(n1, n2);
                    break;
                case "%":
                    while (n2 == 0) {
                        do {
                            System.err.println(" Al denominador hay un cero \n"
                                    + "para evitar errores coloca otro valor.");
                            numero2 = sc.nextLine();
                        } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                        n2 = Double.parseDouble(numero2);
                    }
                    res = n1 % n2;
                    break;
            }

            do {
                System.out.printf("\nResultado: %.2f %s %.2f = %.2f\n", n1, operacion, n2, res);
                System.out.println("\n¿Quieres continuar operando? \n [s/n]");

                do {
                    System.out.print("> ");
                    operacion = sc.nextLine();
                    comprobar = operacion.matches("[sSnN]");
                    if (!comprobar) {
                        System.err.println("\nError, por favor, introduce un valor válido.\n");
                    }
                } while (!comprobar);

            } while (operacion.equalsIgnoreCase("s"));
            return 0;
        } while (comprobar);

    }
}
