package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * user enters a grade 1-10 and app gives
 * a message accordingly
 */
public class GradeApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int grade = 0;

        System.out.print("Please enter grade:");
        grade = in.nextInt();

        switch (grade){
            case 0,1,2,3,4 :
                System.out.println("You failed this subject");
                break;
            case 5,6,7,8:
                System.out.println("You passed!");
                break;
            case 9,10:
                System.out.println("You passed with honors");
                break;
            default:
                System.out.println("You entered wrong grade");
                break;

        }
        // ΕΝΑΛΛΑΚΤΙΚΑ
        switch (grade) {
            case 0, 1, 2, 3, 4 -> System.out.println("You failed the subject");
            case 5, 6, 7, 8 -> System.out.println("You passed");
            case 9, 10 -> System.out.println("You passed with honors");
            default -> System.out.println("You entered wrong grade");
        }
    }
}
