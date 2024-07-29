package es2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kmPercorsi;
        int kmLitro;
        while (true) {
            System.out.println("Inserire il numero di km percorso");
            try {
                kmPercorsi = scanner.nextInt();
                if (kmPercorsi < 0) {
                    System.out.println("devi inserire un numero positivo!");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Devi inserire un numero valido!");
                scanner.next();
            } catch (Exception e) {
                System.err.println("Qualcosa è andato storto");
                System.err.println(e.getMessage());
                scanner.next();
            }

        }
        while (true) {
            System.out.println("Quanto carburante hai usato?");
            try {
                int carburanteUsato = scanner.nextInt();
                if (carburanteUsato < 0) {
                    System.out.println("Devi inserire un numero positivo!");
                } else if (carburanteUsato == 0) {
                    throw new ArithmeticException("Non è possibile che non hai consumato carburante!");
                } else {
                    kmLitro = kmPercorsi / carburanteUsato;
                    System.out.println("Il consumo è di: " + kmLitro + " km/l");
                    break;
                }
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Devi inserire un numero e non una parola!");
                scanner.next();
            }
        }
    }
}
