package cl.praxis.miprimerjava.clases;

import java.util.Scanner;

public class clase11 {public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    float numero = 0;
    float resultado =0;
    String ingreso = null;
    int ascii = 0;
    int contador = 0;
    do{


    if ((contador%2 == 0)){
        System.out.println("Ingrese un numero");
    } else {
        System.out.println("Ingrese un operador( +, -, =)");
        contador++;
    }
    ingreso = sc.next();
    ascii =(int)ingreso.charAt(0);
    if(contador==0 && ascii != 43 && ascii !=45 && ascii !=61){
        numero = Float.parseFloat(ingreso);
        resultado = numero;
        contador ++;
    }else{
        if(ascii ==43){
            System.out.println();
        }
    }
}

