import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
         System.out.println("elements in the stack are:");
          System.out.println(s);
          reverseStack(s);
          System.out.println("reversed stack");
           System.out.println(s);
    }
public static void pushBottom(Stack<Integer> stack,int ele){
         if(stack.isEmpty()){
                 stack.push(ele);
                 return;
    }
    int val = stack.pop();
    pushBottom(stack,ele);
    stack.push(val);
     }
public static void reverseStack(Stack<Integer>stack){
          if(stack.isEmpty()){
              return;
          }
          int top=stack.pop();
          reverseStack(stack);
         pushBottom(stack,top);
         
          
          
          
      }
}

