package gr.aueb.cf.cf9.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    }

    public static int[] filterEvent(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];

        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] arrayToReturn = new int[count];
        count = 0;
        for (int el : arr) {
            if (el % 2 == 0) arrayToReturn[count++] = el;
        }
        return arrayToReturn;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int el: arr) {
            sum+=el;

        }
        return sum;
    }

    public static boolean allEven(int[] arr) {
        for (int el : arr) {
            if (el % 2 != 0 ) return false;
        }
        return true;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int countEven= 0;

        for (int el : arr) {
            if (el % 2 == 0) countEven++;
            if (countEven > 2) return true;
        }
        return false;
    }
}
