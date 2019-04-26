package StackMod_v2;

public class Example {
    public static void main(String[] args) {
        StackMod stack = new StackMod();

        stack.push(2);
        stack.push(-2);
        stack.push(4);
        stack.push(9);
        stack.push(4);
        stack.push(9);
        stack.push(10);
        stack.push(28);
        stack.push(-12);


        System.out.println(stack.getMinItem());
        stack.printAllModifiedStackItems();

        stack.pop();

        System.out.println(stack.getMinItem());
        stack.printAllModifiedStackItems();
    }
}
