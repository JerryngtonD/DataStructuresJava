package StackMod;

public class Excample {
    public static void main(String[] args) {
        StackMod stack = new StackMod();

        stack.push(4);
        stack.push(9);
        stack.push(2);
        stack.push(5);
        stack.push(2);
        stack.push(9);
        stack.push(1);

        stack.printAllItems();
        System.out.println(stack.getMin());

        stack.pop();

        stack.printAllItems();
        System.out.println(stack.getMin());
    }
}
