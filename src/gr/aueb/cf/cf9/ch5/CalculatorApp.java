//package gr.aueb.cf.cf9.ch5;
//
//import java.util.Scanner;
//
///**
// * Απλός υπολογιστής τσέπης
// */
//public class CalculatorApp {
//    static Scanner scanner = new Scanner(System.in); //η εμβέλεια της συγκεκριμένης μεθόδου είναι καθολική
//
//
//    public static void main(String[] args) {
//        int
//        int choice = 0;
//
//        while (true) {
//            printMenu();
//            choice = getOneInt();
//
//            if (!isChoiceValid(choice)){
//                continue;
//            }
//
//            choiceresult(choice, num1, num2);
//        }
//
//    public static void printMenu() {
//            System.out.println("Επιλέξτε ένα από τα παρακάτω");
//            System.out.println("1. Πρόσθεση");
//            System.out.println("2. Αφαίρεση");
//            System.out.println("3. Πολλαπλασιασμός");
//            System.out.println("4. Διαίρεση");
//            System.out.println("5. Υπόλοιπο Διαίρεσης");
//            System.out.println("6. Έξοδος");
//    }
//
//    public static int getOneInt() {
//            return scanner.nextInt();
//    }
//
//    public static boolean isChoiceValid(int choice) {
//            return choice >=1 && choice <= 6;
//    }
//
//    public static int(int n) {
//
//            switch (n) {
//                case 1:
//            }
//        }
//    }
//}
