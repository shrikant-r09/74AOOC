// Stack Interface
interface Stack {
    int size = 5; // fixed size stack
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// IntegerStack Implementation
class IntegerStack implements Stack {
    private int[] stack = new int[size];
    private int top = -1;

    @Override
    public void push(int element) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            stack[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            int popped = stack[top--];
            System.out.println("Popped: " + popped);
            return popped;
        }
    }

    @Override
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    @Override
    public boolean overflow() {
        return top >= size - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}

// Test class
public class StackTest {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

        stack.pop(); // underflow
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // overflow

        stack.display();

        stack.pop();
        stack.pop();
        stack.display();
    }
}
