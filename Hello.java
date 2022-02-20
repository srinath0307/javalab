import java.util.*;
interface Stack
{
    void push(int data);
    int pop();
    int peek();
    boolean isEmpty();
    void display();
}
class ArrayStack implements Stack
{
    int top;
    int []st;
    public ArrayStack(int max)
    {
        st=new int[max];
        top=-1;
    }
    public void push(int data)
    {
        st[++top]=data;
    }
    public int pop()
    {
        int item;
        item=st[top];
        top--;
        return item;
    }
    public int peek()
    {
        return st[top];
    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        public void display()
        {
            if(top==-1)
            {
                int t=st[-1];
            }
            if(top>100)
            {
                top=99;
            }
            for(int i=0;i<=top;i++)
            {
                System.out.print(st[i]+" ");
            }
        }
}
public class Hello {

    static final int SIZE = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new ArrayStack(SIZE);
        int N = sc.nextInt();
        for (int query = 1; query <= N; query++) {
            int queryType = sc.nextInt();
            switch (queryType) {
                case 1:
                    try {
                        stack.push(sc.nextInt());
                    } catch (Exception e) {
                        System.out.println("Stack Overflow");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Popped Element: " + stack.pop());
                    } catch (Exception e) {
                        System.out.println("Stack Underflow");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Top Element: " + stack.peek());
                    } catch (Exception e) {
                        System.out.println("Stack Empty");
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Stack Elements: ");
                        stack.display();
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println("Stack Empty");
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("TRUE");
                    } else {
                        System.out.println("FALSE");
                    }
            }
        }
    }
}
