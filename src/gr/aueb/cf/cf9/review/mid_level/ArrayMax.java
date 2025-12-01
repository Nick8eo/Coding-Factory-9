package gr.aueb.cf.cf9.review.mid_level;

public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int maxPos = 0;

        maxPos = positionMax(arr);

        if (maxPos != -1) {
            System.out.println(arr[maxPos]);
        } else {
            System.out.println("Array is empty");
        }
    }

    public static int positionMax(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int maxPos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxPos]) {
                maxPos = i;
            }
        }
        return maxPos;


    }
}
