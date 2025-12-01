package gr.aueb.cf.cf9.ch4;

/**
 * for demo (infinite repeatitions)
 */
public class ForEverAppWithBreakApp {
    public static void main(String[] args) {
        int count = 0;
        for (;;) {
            System.out.print("forever");
            count++;
            if (count % 10 == 0) System.out.println();
            if (count == 100) break;
        }
    }
}
