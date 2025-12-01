package gr.aueb.cf.cf9.review.challenges;

/**
 * Από ένα σημείο x, να πάει σε ένα σημείο y
 * όπου κάθε jump είναι j.
 */
public class FrogJumps {

    public static void main(String[] args) {
        int x = 10;
        int y = 55;
        int j = 25;

        System.out.println(countJumps(x,y,j));
    }

    public static int countJumps(int x, int y, int j) {

        int count = 0;

        for (int i = x; i < y; i = i+j) {
            count ++;
        }

        return count;
    }
}
