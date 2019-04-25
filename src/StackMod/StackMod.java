package StackMod;

public class StackMod extends Stack {
    private Stack minStack = new Stack();
    private Stack stackItems = new  Stack();
    private Integer currentMin = null;

    public void push(Integer item) {
        if(currentMin == null)  {
            currentMin = item;
        }

        if(item < currentMin) {
            currentMin = item;
        }

        stackItems.doPush(item);
        minStack.doPush(currentMin);

    }

    public int pop() {
        if(stackItems.doPeek() != -1) {
            minStack.doPop();
            return stackItems.doPop();
        }
        return -1;
    }

    public int getMin() {
        return minStack.doPeek();
    }

    public void printAllItems() {
        stackItems.printAll();
    }
}
