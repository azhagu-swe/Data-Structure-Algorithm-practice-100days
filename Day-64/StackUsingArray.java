// Implement a Stack Using Arrays
// Implement a stack data structure using arrays in Java, including push, pop, and isEmpty operations.

// Here’s a basic implementation of a stack using arrays in Java:

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        System.out.println(stack.peek());

    }

}

class Stack {
    private int[] data;
    private int size;
    private int top;

    public Stack() {
        data = new int[10];
    }

    public Stack(int size) {
        data = new int[size];
        this.size = size;
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack OverFlow! cannot push element " + value + ".");
            return;
        }
        data[++top] = value;
        System.out.println("Pushed element " + value + " onto the stack.");

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println(" Stack underFlow! cannot pop from an empty stack.");
            return -1;
        }
        int value = data[top--];
        System.out.println("Popped element " + value + " from the stack.");
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! cannot peek.");
            return -1;
        }

        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}
