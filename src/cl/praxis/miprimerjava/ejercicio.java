package cl.praxis.miprimerjava;

import java.util.Scanner;

public class ejercicio {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);


        int  numero1;
        int numero2;
        int numero3;

        System.out.println("Ingrese el primer valor");
        numero1 = sc.nextInt();

        System.out.println(" Ingrese el segundo valor");
        numero2= sc.nextInt();

        System.out.println("Ingrese el tercer valor");
        numero3=sc.nextInt();

        if(numero1 > numero2 && numero1> numero3){
            System.out.println("El mayor de los número es" +numero1);
            
        } else if ( numero2 > numero3 && numero2 > numero1) {
            System.out.println("El mayor de los numeros es " +numero2);
       
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El mayor de los números es" +numero3);
            
        }else{
            System.out.println("No hay número mayor");
        }


    }
}
