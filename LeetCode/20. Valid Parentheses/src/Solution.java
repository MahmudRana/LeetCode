import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s1 = "(){([{}])}";
        System.out.println(isValid(s1));
    }
    public static boolean isValid(String s) {
        boolean isValid = true;
        Stack<Character>stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.isEmpty() || stack.peek()!='('){
                    isValid = false;
                    break;
                }else{
                    stack.pop();
                }
            }else if(ch=='}'){
                if(stack.isEmpty() || stack.peek()!='{'){
                    isValid = false;
                    break;
                }else{
                    stack.pop();
                }
            }else if(ch==']'){
                if(stack.isEmpty() || stack.peek()!='['){
                    isValid = false;
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            isValid = false;
        }
        return isValid;
    }
}
