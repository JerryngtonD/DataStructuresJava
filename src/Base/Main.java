public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Stack stack = new Stack();

        queue.push(3);
        queue.push(9);
        queue.push(2);
        queue.push(-5);
        queue.push(-2);

        System.out.println(queue.getAll());
        System.out.println(queue.getMax());
        System.out.println(queue.getMin());

        queue.pop();
        queue.pop();
        queue.pop();

        System.out.println(queue.getAll());
        System.out.println(queue.getMax());
        System.out.println(queue.getMin());

        System.out.println("-----------------------");

        stack.push(2);
        stack.push(-8);
        stack.push(-1);
        stack.push(5);
        stack.push(23);
        stack.push(17);
        stack.push(20);

        System.out.println(stack.getAll());
        System.out.println(stack.getMax());
        System.out.println(stack.getMin());


        stack.pop();
        stack.pop();


        System.out.println(stack.getAll());
        System.out.println(stack.getMax());
        System.out.println(stack.getMin());
    }
}
