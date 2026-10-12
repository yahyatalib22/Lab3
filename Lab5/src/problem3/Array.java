package problem3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int numInt = scan.nextInt();
        int[] integers = new int[numInt];
        System.out.println("Enter " + numInt + " of integers: ");
        for (int i=0; i < numInt; i++) {
            integers[i] = scan.nextInt();
        }

        System.out.println("Original integers array: ");
        for (int i = 0; i < integers.length; i++){
            System.out.print(integers[i] + " ");
        }

        System.out.println("");
        int temp;
        for (int i = 0; i <= (Math.floor(integers.length/2)); i++){
            temp = integers[(integers.length - 1) - i];
            integers[(integers.length - 1) - i] = integers[i];
            integers[i] = temp;
        }

        System.out.println("Reversed integers array: ");
        for (int i = 0; i < integers.length; i++){
            System.out.print(integers[i] + " ");
        }

    }
}
