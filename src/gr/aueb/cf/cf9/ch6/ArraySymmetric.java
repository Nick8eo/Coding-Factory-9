package gr.aueb.cf.cf9.ch6;

/**
 * Ελέγχει αν ένας πίνακας ακεραίων
 * είναι συμμετρικός ή όχι. Συμμετρικός είναι ένας πίνακας
 * αν διαβάζεται το ίδιο από την αρχή και το τέλος.
 * π.χ. [1, 2, 3, 3, 2, 1]
 */
public class ArraySymmetric {
    public static void main(String[] args) {
        int[] grid1 = {1, 2, 3, 2, 1};
        int[] grid2 = {1, 2 ,3 ,3 ,2 ,1};
        int[] grid3 = {1, 2, 3, 4, 2, 1};

        System.out.println(isSymmetric(grid3));
    }

    public static Boolean isSymmetric(int[] arr) {

        for (int i = 0; i < (arr.length / 2); i++) {
            if (arr[i] != arr[(arr.length-1)-i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSymmetric2(int[] arr) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }

}
