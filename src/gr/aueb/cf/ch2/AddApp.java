package gr.aueb.cf.ch2;

/** overflow
 *
 */
public class AddApp {
    public static void main(String[] args) {
      //Δήλωση και αρχικοποίηση μεταβλητων

        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

    //Εντολές
        result = num1 + num2;

        //εμφάνιση αποτελεσμάτων
        System.out.println("Sum: " + result);


    }
}
