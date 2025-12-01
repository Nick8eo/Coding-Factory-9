package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Αναζητά ένα στοιχείο σε έναν πίνακα
 */
public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 0;
        int position = 0;

        System.out.println("Please enter the value to search for: ");
        x = in.nextInt();

        position = getPosition(arr, x);

        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.printf("Value: %d found at position %d", x, (position + 1));
        }
    }
        /**
         * Επιστρέφει τη θέση του 1ου στοιχείου του πίνακα
         * που ισούται με την τιμή αναζήτησης (x). Αν δεν υπάρχει
         * το στοιχείο, επιστρέφει την τιμή -1
         * @param arr
         * @param x
         * @return
         */
        public static int getPosition(int[] arr, int x){
            if (arr == null) return -1;

            int positionToReturn = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    positionToReturn = i;
                    break;
                }
            }
            return positionToReturn;
        }

}
