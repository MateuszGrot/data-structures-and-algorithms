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


    }
}