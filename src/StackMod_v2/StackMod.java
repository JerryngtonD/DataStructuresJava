package StackMod_v2;

import java.util.Iterator;
import java.util.Stack;

public class StackMod {
    private Stack<Integer> stack = new Stack<>();
    private Integer minItem;

    public void push(Integer item) {
        if(stack.isEmpty()) {
            minItem = item;
            stack.push(item);
        } else if(item > minItem) {
            stack.push(item);
        } else {
            stack.push(2 * item - minItem);
            minItem = item;
        }
    }

    public Integer pop() {
        if(stack.isEmpty()) {
            return null;
        } else if (stack.peek() > minItem) {
            return stack.pop();
        } else {
            Integer previousMinItem = minItem;
            minItem = 2 * minItem - stack.peek();
            stack.pop();
            return previousMinItem;
        }
    }

    public Integer getMinItem() {
        return minItem;
    }

    public void printAllModifiedStackItems() {
        for (Object stackItem : stack) {
            System.out.print(stackItem + "; ");
        }
        System.out.println("\n");
    }

}
