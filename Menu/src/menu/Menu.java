
package menu;

import java.util.Scanner;

public class Menu {
    
    public static void menuu(Scanner intro){
        int opc;
        int num1=0;
        int num2=0;
        do{
            System.out.println("1: sumar numeros");
            System.out.println("2: restar numeros");
            System.out.println("3: multiplicar numeros");
            System.out.println("4: dividir numeros");
            System.out.println("5: porcentaje");
            System.out.println("6: el numero mayor");
            System.out.println("7: salir");
            opc= intro.nextInt();
            switch (opc){
                case 1:
                    suma(intro,num1,num2);
                    break;
                case 2:
                    resta(intro,num1,num2);
                    break;
                case 3:
                    multi(intro,num1,num2);
                    break;
                case 4:
                    division(intro,num1,num2);
                    break;
                case 5:
                    porc(intro,num1,num2);
                    break;
                case 6: 
                    mayor(intro,num1,num2);
                    break;
                case 7:
                    salir(intro,num1);
                    break;
                  
            }
            
        }while(opc!=6);
    }
    public static void suma(Scanner intro,int num1, int num2){
        System.out.println("ingrese numeros");
        num1=intro.nextInt();
        num2=intro.nextInt();
        int suma= num1+num2;
        System.out.println("el resultado de la suma es:"+suma);
    }
    public static void resta(Scanner intro, int num1, int num2){
        System.out.println("ingrese numeros");
        num1=intro.nextInt();
        num2=intro.nextInt();
        int resta= num1-num2;
        System.out.println("el resultado de la resta es:"+resta);
    }
    public static void multi(Scanner intro,int num1, int num2){
        System.out.println("ingrese numeros");
        num1=intro.nextInt();
        num2=intro.nextInt();
        int multiplicacion=num1*num2;
        System.out.println("el resultado de la multipliacion"+multiplicacion);
    }
    public static void division(Scanner intro,int num1, int num2){
        System.out.println("ingrese numeros");
        num1=intro.nextInt();
        num2=intro.nextInt();
        double div=(double)(num1/num2);
        System.out.println("el resultado de la division es:"+div);
    }
     public static void mayor(Scanner intro,int num1, int num2){
         System.out.println("ingrese numeros");
        num1=intro.nextInt();
        num2=intro.nextInt();
        int max=0;
        if(num1>num2){
            max=num1;
        }
        if(num2>num1){
            max=num2;
        }
         System.out.println("el numero mayor es:"+max);
     }
     public static void porc(Scanner intro,int num1, int num2){
          System.out.println("ingrese un numero");
        num1=intro.nextInt();
         System.out.println("ingrese porciento");
        num2=intro.nextInt();
         double porciento=(double)(num1*num2/100);
         System.out.println("el"+num2+"% de"+num1+ "es:"+porciento);
         
     }
    public static void salir(Scanner intro,int num1){
        System.out.println("quiere salir");
        System.out.println("1:(si) y 2:(no)");
        num1=intro.nextInt();
        if(num1 == 1){
            System.out.println("adios");
        }
        if (num1==2){
            menuu(intro);
        }
    }

    public static void main(String[] args) {
       Scanner intro = new Scanner(System.in);
       menuu(intro);
    }
    
}
