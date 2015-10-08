
package javaapplication61;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication61 {

   public static void menu(Scanner intro){
        int opc = 0;
        int num1 = 0;
        int num2 = 0;
        boolean ciclo=true;
        
        do{
          do {
            System.out.println("eliga que operacion desea");    
            System.out.println("1: sumar numeros");
            System.out.println("2: restar numeros");
            System.out.println("3: multiplicar numeros");
            System.out.println("4: dividir numeros");
            System.out.println("5: porcentaje (numero y porcentaje a calcular)");
            System.out.println("6: el numero mayor");
            System.out.println("7: salir");
            try {
            opc= intro.nextInt();
            while(opc>7 || opc<1){
                System.out.println("ingrese un numero entre 1 y 7");
                opc= intro.nextInt();
            }
            if (opc!=7){   
               System.out.println("ingrese dos numero ");
               num1=intro.nextInt();
               num2=intro.nextInt(); 
                 if (opc==4 && num2==0){
                     System.out.println("ingrese numero mayor que cero ");
                     num1=intro.nextInt();
                     num2=intro.nextInt();
                 }
            }
            
            ciclo = false;
            }catch(InputMismatchException a){
              System.out.println("\t error de tipo"+ a);
                    intro.nextLine();
                    System.out.println("ingrese sólo valores numéricos");
            }
            }while(ciclo);
            ciclo = true;
        
            switch (opc){
                
                case 1:
                    
                    System.out.println("el resultado de la suma es:"+ sumar(num1, num2));
                    break;
                    
                case 2:
                   
                    System.out.println("el resultado de la resta es:"+ restar(num1, num2));
                    break;
                    
                case 3:
                    
                    System.out.println("el resultado de la multiplicacion es:"+ multiplicar(num1, num2));
                    break;
                    
                case 4:   
                    
                    System.out.println("el resultado de la division es:"+ dividir(num1, num2));
                    break;
                    
                case 5:
                    
                    System.out.println("el porcentaje es:"+porcentaje(num1,num2));
                    break;
                    
                case 6:
                    
                    System.out.println("el numero mayor es :"+mayor(num1,num2));
                    break;
                 
                case 7:
                     salir(intro,num1);
            }
        }while(opc!=7);
            
    }
    public static int sumar(int num1, int num2){
        int suma = 0;
        suma = num1 + num2;
        return suma;
    }
    public static int restar(int num1, int num2){
        int resta = 0;
        resta = num1 - num2;
        return resta;
    }
    public static int multiplicar(int num1, int num2){
        int multi = 0;
        multi = num1 * num2;
        return multi;
    }
    public static int dividir(int num1, int num2){
        int div = 0;
        div = num1 / num2;
        return div;
    }
    public static double porcentaje(int num1, int num2){
        double porc=0;
        porc=(num1*num2/100);
        return porc;
    }    
    public static int mayor(int num1, int num2){
        int max=0;
        if(num1>num2){
            max=num1;
        }
        if(num2>num1){
            max=num2;
        }
        return max;
    }
    public static void salir(Scanner intro,int num1){
        System.out.println("quiere salir");
        System.out.println("1:(si) y 2:(no)");
        num1=intro.nextInt();
        if(num1 == 1){
            System.out.println("adios");
        }
        if (num1==2){
            menu(intro);
        }
    }
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        menu(intro);
    }
    
    
}