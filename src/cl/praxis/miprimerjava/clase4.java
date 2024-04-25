package cl.praxis.miprimerjava;

import java.util.Scanner;

public class clase4 {
    public static  void main  (  String[] arg ){
       Scanner sc =new Scanner(System.in);

       System.out.println("Ingrese su edad");
       int edad =sc.nextInt();

       if(edad <18) {
           System.out.println("Es menor de edad");

       } else if (edad > 18) {
           System.out.println("Es mayor de edad");
       }else {
           System.out.println("No es mayor ni menor de de 18");
       }
        System.out.println( "Ingrese primer texto" );
       String texto1=sc.next();
        System.out.println( "Ingrese segundo texto");
        String texto2= sc.next();

        if (texto1.equals(texto2)){
            System.out.println("Los textos son iguales");
        }else {
            System.out.println("Los textos son diferentes");
            System.out.println(texto1.compareTo(texto2));
        }



    }
}
