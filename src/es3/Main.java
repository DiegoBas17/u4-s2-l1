package es3;

import exceptions.BancaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoCorrente contoCorrente = new ContoCorrente("Gabriel", 2500);
        ContoOnLine contoOnLine = new ContoOnLine("gabriel", 2500, 1000);
        while (true) {
            int scelta;
            while (true) {
                System.out.println("Seleziona il contro per effettuare il prelievo: 1 per il conto corrente, 2 per il conto online e 3 per uscire");
                try {
                    scelta = scanner.nextInt();
                    if (scelta < 1 || scelta > 3) {
                        System.out.println("Scelta non valida. Riprova, devi inserire un numero da 1 a 3!");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Inserisci un numero valido.");
                    System.out.println(e.getMessage());
                    scanner.next(); // Consuma l'input non valido
                }
            }
            if (scelta == 3) {
                break;
            }
            System.out.println("Inserisci l'importo da prelevare: ");
            double importo = scanner.nextDouble();

            try {
                if (scelta == 1) {
                    contoCorrente.preleva(importo);
                    System.out.println("Prelievo effettuato. Saldo attuale: " + contoCorrente.getSaldo());
                } else if (scelta == 2) {
                    contoOnLine.preleva(importo);
                    System.out.println("Prelievo effettuato. Saldo attuale: " + contoOnLine.getSaldo());
                } else {
                    System.out.println("Scelta non valida.");
                }
            } catch (BancaException e) {
                System.out.println("Errore: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Errore generico: " + e.getMessage());
            }

        }
    }
}
