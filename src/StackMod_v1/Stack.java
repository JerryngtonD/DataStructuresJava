package StackMod_v1;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> stack = new ArrayList<>();

    public void doPush(Integer value) {
        stack.add(value);
    }

    public int doPop() {
        if (!stack.isEmpty()) {
            int lastItemIdx = stack.size() - 1;
            int lastItem = stack.get(lastItemIdx);
            stack.remove(lastItemIdx);
            return lastItem;
        }
        return -1;
    }

    public int doPeek() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return -1;
    }

    public void printAll() {
        System.out.println(stack);
    }
}
