package cl.praxis.miprimerjava.desafios;

import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int opcion = 0;

        do {
            System.out.println("Ingrese un numero mayor a 0");
            while (!sc.hasNextInt()) {
                System.out.println("Opcion invalida. Intente de nuevo:");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);


        // Seleccion de patron

        System.out.println("Seleccione el patron a ver:");
        System.out.println("1. Patron 1");
        System.out.println("2. Patron 2");
        System.out.println("3. Patron 3");
        System.out.println("4. Patron 4");

        // bucle do while
        do {
            System.out.println("Ingrese una opcion entre 1 y 4:");
            while (!sc.hasNextInt()) {
                System.out.println("Opcion invalida. Intente de nuevo:");
                sc.next();
            }
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 4) {
                System.out.println("Opcion invalida. Seleccione una opcion entre 1 y 4:");
            }
        } while (opcion < 1 || opcion > 4);

        switch (opcion) {
            case 1:
                System.out.println("\n" + "-- Patron 1 --");
                Patron1(n);
                break;
            case 2:
                System.out.println("\n" + "-- Patron 2 --");
                Patron2(n);
                break;
            case 3:
                System.out.println("\n" + "-- Patron 3 --");
                Patron3(n);
                break;
            case 4:
                System.out.println("\n" + "-- Patron 4 --");
                Patron4(n);
                break;

        }

        sc.close();

    }

    private static void Patron1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n || i == 1 || j == 1 || j == n)
                    System.out.println("*");
                 else
                     System.out.println(" ");

            }
            System.out.println("\n");
        }
    }

    private static void Patron2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n || i == 1 || i == n - j + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    private static void Patron3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i == n - j + 1)
                    System.out.print("x");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }


    private static void Patron4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j < n) || (i == n && j > 1) || (i > 1 && j > 1 && j < n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}