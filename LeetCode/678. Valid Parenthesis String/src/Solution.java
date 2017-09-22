import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s1="()";
        String s2="(*)";
        String s3="(*))";
        String s4 = "((((*****()))))))))))";
        System.out.println(checkValidString(s4));

    }
    public static boolean checkValidString(String s) {
        Stack<Character>stack= new Stack();
        int starCount = 0;
        int poppedCount = 0;
        boolean isValid = true;
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.isEmpty()){
                    if(starCount==0){
                        if(poppedCount==0){
                            isValid=false;
                            break;
                        }else{
                            poppedCount--;
                        }
                    }else{
                        starCount--;
                    }
                }else{
                    stack.pop();
                }
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                starCount++;
                poppedCount++;
            }
        }
        if(!stack.isEmpty()){
            isValid=false;
        }

        return isValid;
    }
}
