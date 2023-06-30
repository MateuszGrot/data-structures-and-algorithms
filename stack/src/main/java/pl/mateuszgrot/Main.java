package pl.mateuszgrot;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // stack - LIFO; Last in, first out

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());
        stack.push("Diablo IV");
        stack.push("Dead Cells");
        stack.push("Witcher");
        stack.push("Elden Ring");

        System.out.println(stack);

        String myFavGame = stack.pop(); // removing from the stack and assign to new var
        System.out.println(myFavGame);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.search("Diablo IV"));

        // easy to overload a memory, out of memory error - heap space

        // EXAMPLE OF USING STACK -  REVERS ARRAY

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array before revers: ");
        printArray(array);

        reverseArray(array);
        System.out.println();
        System.out.println("Array after revers: ");
        printArray(array);


    }

    private static void reverseArray(int[] array) {

        Stack<Integer> integerStack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            integerStack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = integerStack.pop();
        }

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}