import java.util.Stack;
class Main {
    public static void main(String[] args) {
        Stack<Integer>  s= new Stack<Integer>();
        s.push(10);
         s.push(20);
          s.push(30);
       System.out.println(s);
       pushBottom(s,40);
        System.out.println(s);
     
    }
    public static void pushBottom(Stack<Integer>stack,int element){
        if (stack.isEmpty()){
            stack.push(element);
            return;
        }
        int value=stack.pop();
        pushBottom(stack,element);
        stack.push(value);
    }
}