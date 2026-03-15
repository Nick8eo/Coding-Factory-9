package gr.aueb.cf.cf9.ch17;

import java.util.Scanner;

public class GenericMain {

    public static void main(String[] args) {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Double> doubleNode = new GenericNode<>();   // Στα generics, όχι primitives ως παραμετρικοί τύποι
        Scanner scanner = new Scanner(System.in);

        //System.out.print("GIVE ME EVERYTHING YOU'VE GOT: ");
        //Integer x = Integer.parseInt(scanner.nextLine());

        var intNode = new GenericNode<Integer>();
        intNode.setValue(8);

        doubleNode.setValue(10.5);
        strNode.setValue("Hello");

        System.out.printf("These are the results:  %s",  strNode.getValue());
    }
}