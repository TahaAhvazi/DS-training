package stacks;

import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];
    private int count = 0;

    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError();
        items[count++] = item;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();
        count--;
        return items[count];
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
