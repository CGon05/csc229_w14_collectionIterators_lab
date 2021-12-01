import java.util.*;
import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args) {
        
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        Scanner StdIn = new Scanner("( ( 1 + 5) - ( 4 - 7 ) )");
        while (StdIn.hasNext()){
            String s = StdIn.next();
            if (s.equals("(")){}
            else if (s.equals("*")){
                ops.push(s);
            }
            else if (s.equals("/")){
                ops.push(s);
            }
            else if (s.equals("+")){
                ops.push(s);
            }
            else if (s.equals("-")){
               ops.push(s); 
            }
            else if (s.equals(")")){
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("*")){
                
                    v = vals.pop() * v;
                    
                }
                if (op.equals("/")){
                
                    v = vals.pop() / v;
                    
                }
                if (op.equals("+")){
                
                    v = vals.pop() + v;
                    
                }
                if (op.equals("-")){
                
                    v = vals.pop() - v;
                    
                }
                vals.push(v);
            }
            else{
                
                vals.push(Double.parseDouble(s));
                
            }
        }
        System.out.println(vals.pop());
    }
    
}