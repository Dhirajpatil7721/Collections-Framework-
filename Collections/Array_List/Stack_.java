//First in Last Out
import java.util.Stack;
public class Stack_{
    public static void main(String[] args) {
        Stack<Integer> num=new Stack<>();

        num.push(10);
        num.push(20);
        num.push(30);
        num.push(40);

        System.out.println(num);
        System.out.println(num.peek());
        
        num.pop();
        System.out.println(num);
        System.out.println(num.peek());
        
        
    }
} 