import java.util.*;

//push at buttom

public class StackClass {

    public static void pushAtButtom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtButtom(data, s);
        s.push(top);
    }
    public static void main(String arg[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtButtom(4, s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}



// reverse stack 


class StackClass1 {

    public static void pushAtButtom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtButtom(data, s);
        s.push(top);
    }

    public static void revese(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        revese(s);
        pushAtButtom(top, s);

    }
    public static void main(String arg[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        revese(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
