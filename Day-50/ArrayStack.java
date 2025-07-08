
public class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1; // Initialize top as -1 to indicate an empty stack
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow! cannot push element " + element);
            return;
        }
        stackArray[++top] = element;
        System.out.println("Pushed element " + element + " onto the stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! cannot pop from an empty stack.");
            return -1;
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped element " + poppedElement + " from the stack.");
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! cannot peek.");
            return -1;
        }
        return stackArray[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); //Stack overflow! cannot push element 6
        System.out.println("Top element of the stack : "+stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        

    }

}
