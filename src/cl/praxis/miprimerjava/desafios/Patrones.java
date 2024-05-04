package cl.praxis.miprimerjava.desafios;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int num = 13;
        patron1(num);
        System.out.print("\n");
        patron2(num);
        System.out.print("\n");
        patron3(num);
    }

    public static void patron1 (int cant) {
        for (int i = 0; i < cant; i++) {
            if(i % 2 == 0){
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
    }

    public static void patron2 (int cant) {
        int aux = 1;
        for (int i = 0; i < cant; i++) {
            System.out.print(aux);
            if(aux == 4){
                aux = 0;
            }
            aux++;
        }
    }

    public static void patron3(int cant) {
        for (int i = 1; i <= cant; i++) {
            if (i % 3 == 0) {
                System.out.print("*");
            } else {
                System.out.print("|");
            }
        }
    }

}
