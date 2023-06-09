package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει euros σε δολάρια ΗΠΑ
 * Λαμβάνει από τον χρήστη (stdin) έναν ακέραιο
 * που συμβολίζει το ποσό σε Euros και μεταρέπει
 * σε δολάρια και εμφανίζει το τελικό αποτέλσμα
 */
public class EuroToUsdConverterApp {

    public static void main(String[] args) {
        //Declaration & initialization
        Scanner scanner = new Scanner (System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        /** parity = ισοτιμία του euro με το δολάριο
         *
         */
        final int PARITY = 99;


        //Commands
        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros *  99;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Print results
        System.out.printf("%d Euros= %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);




    }
}
