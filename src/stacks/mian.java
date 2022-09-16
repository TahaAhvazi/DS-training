package stacks;

public class mian {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack);
        // int top = stack.pop();
        // System.out.println(top);
        // System.out.println(stack);
        // top = stack.peek();
        // System.out.println(top);

        String str = null;
        StringReverser reverser = new StringReverser();
        String reversed = reverser.reverse(str);
        System.out.println(reversed);

    }
}
