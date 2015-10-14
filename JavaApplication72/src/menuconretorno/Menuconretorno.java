package menuconretorno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menuconretorno {

    public static void menu(Scanner intro) {
        int opc = 0;
        int num1 = 0;
        int num2 = 0;
        String result = "";
        boolean ciclo = true;
        do {
            System.out.println("eliga que operacion desea");
            System.out.println("1: sumar numeros");
            System.out.println("2: restar numeros");
            System.out.println("3: multiplicar numeros");
            System.out.println("4: dividir numeros");
            System.out.println("5: el numero mayor");
            System.out.println("6: la potencia de un numero");
            System.out.println("7: salir");
            do {
                try {
                    opc = intro.nextInt();
                    while (opc > 7 || opc < 1) {
                        System.out.println("ingrese un numero entre 1 y 7");
                        opc = intro.nextInt();
                    }
                    ciclo = false;
                } catch (InputMismatchException a) {
                    System.out.println("\t error de tipo" + a);
                    intro.nextLine();
                    System.out.println("ingrese sólo valores numéricos");
                }
            } while (ciclo);
            ciclo = true;
            do {
                try {
                    if (opc != 7) {
                        System.out.println("ingrese dos numero ");
                        num1 = intro.nextInt();
                        num2 = intro.nextInt();
                    }
                    ciclo = false;
                } catch (InputMismatchException a) {
                    System.out.println("\t error de tipo" + a);
                    intro.nextLine();
                    System.out.println("ingrese sólo valores numéricos");
                }
            } while (ciclo);
            ciclo = true;

            switch (opc) {

                case 1:

                    result(String.valueOf(sumar(num1, num2)));
                    break;

                case 2:

                    result(String.valueOf(restar(num1, num2)));
                    break;

                case 3:

                    result(String.valueOf(multiplicar(num1, num2)));
                    break;

                case 4:

                    result(String.valueOf(dividir(num1, num2)));
                    break;

                case 5:

                    result(String.valueOf(mayor(num1, num2)));
                    break;

                case 6:

                    result(String.valueOf(potencia(num1, num2)));
                    break;

                case 7:
                    salir(intro, num1);
            }
        } while (opc != 7);
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double dividir(int num1, int num2) {
        return num1 / num2;
    }

    public static double potencia(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static int mayor(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void salir(Scanner intro, int num1) {
        System.out.println("quiere salir");
        System.out.println("1:(si) y 2:(no)");
        num1 = intro.nextInt();
        if (num1 == 1) {
            System.out.println("adios");
        }
        if (num1 == 2) {
            menu(intro);
        }
    }

    public static void result(String resul) {
        System.out.println("el resultado de la operacion es: " + resul);
    }

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        menu(intro);
    }

}
