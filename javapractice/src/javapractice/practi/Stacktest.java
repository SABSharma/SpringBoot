package javapractice.practi;

import java.util.Stack;

public class Stacktest {
	
//	static boolean isclosingBracket(Character c) {
//		if()
//		
//		return false;
//		
//	}
	
	public boolean pranthesischeck(String s) {
		Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
             if( s.charAt(i)=='(' ||
                s.charAt(i)=='{' ||
                s.charAt(i)=='['  )  {
                    stack.push(s.charAt(i)) ;
                }

             else{
            	 if(stack.isEmpty())
            		 return false;
                if( stack.peek() == '(' && s.charAt(i) == ')' ||
                		stack.peek() == '{' && s.charAt(i) == '}' ||
                		stack.peek() == '[' && s.charAt(i) == ']') {
                        stack.pop();
                    }

                else{
                    return false;
                }
             }


        }
        
       // return true;

        if(stack.isEmpty()){
            return true;
        }
        else
            return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="()[]{}";
		Stacktest ob = new Stacktest();
		 boolean pranthesischeck = ob.pranthesischeck(s);
		 System.out.println(pranthesischeck);
//		Stack<Integer> stack = new Stack<Integer>();
//		 
//        // Use add() method to add elements
//        stack.push(10);
//        stack.push(15);
//        stack.push(30);
//        stack.push(20);
//        stack.push(5);
// 
//        // Displaying the Stack
//        System.out.println("Initial Stack: " + stack);
// 
//        // Removing elements using pop() method
//        System.out.println("Popped element: "
//                           + stack.pop());
//        System.out.println("+++++++++++++++++++");
//        System.out.println("Initial Stack 1: " + stack);
//        System.out.println("Popped element: "
//                           + stack.peek());
//        System.out.println("Initial Stack 2: " + stack);

	}

}
