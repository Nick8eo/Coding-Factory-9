package gr.aueb.cf.cf9.ch2;

public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2; //Η διαίρεση ακεραίων δίνει πάντα ακέραιο
        mod = num1 % num2; //Το υπόλοιπο της ακέραιας διαίρεσης

        System.out.printf("Sum: %d , Sub: %d , Mul: %d , Div: %d , Mod: %d\n" , sum, sub,mul,div,mod);

        result1 = result1 + 1;  // Προσθέτει 1 στην μεταβλητή
        result2 += 1;           // Προσθέτει 1 στην μεταβλητή
        result3++;              // Προσθέτει 1 στην μεταβλητή

        System.out.printf("Result1: %d , Result2: %d , Result3: %d\n",result1,result2,result3);

        result4 = num1++;       // πρώτα εκχωρεί το num1 στο result4 και μετά θα το αυξήσει
        result5 = ++num1;       // πρώτα αυξάνει το num1 και μετά το εκχωρεί
        System.out.printf("Result5: %d, num1: %d",result5, num1);
    }
}
