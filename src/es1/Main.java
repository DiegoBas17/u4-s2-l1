package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i;
            int valoreScelto;
            while (true) {
                System.out.println("Inserisci un numero da 1 a 5, per inserire nella locazione scelta un valore");
                try {
                    i = scanner.nextInt() - 1;
                    if (i < 0 || i > 4) {
                        System.err.println("Il numero deve essere compreso tra 1 e 5.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.err.println("Inserisci un numero intero valido.");
                    System.err.println(e.getMessage());
                    scanner.next();
                }
            }
            while (true) {
                System.out.println("Inserisci un numero da 1 a 10, da inserire nella locazione scelta come valore");
                try {
                    valoreScelto = scanner.nextInt();
                    if (valoreScelto < 1 || valoreScelto > 10) {
                        System.err.println("Il numero deve essere compreso tra 1 e 10.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.err.println("Inserisci un numero intero valido.");
                    System.err.println(e.getMessage());
                    scanner.next();
                }
            }

            if (valoreScelto == 0) break;

            myArray[i] = valoreScelto;
            System.out.println("Valore inserito in myArray[" + i + "]: " + myArray[i]);
        }
        scanner.close();
    }
}
