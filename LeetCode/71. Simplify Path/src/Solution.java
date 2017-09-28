import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String path = "/a/./b/..///../c/a/.";
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
       // ArrayList<String>paths = new ArrayList<>();
        Stack<String>stack = new Stack<>();
        String[] pathString = path.split("[/]+");
        System.out.println(pathString.length);
        System.out.println(Arrays.toString(pathString));
        for(int i=0;i<pathString.length;i++){
            if(pathString[i]!=null){
                if("..".equals(pathString[i])){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }else if(".".equals(pathString[i])){

                }
                else{
                    stack.push(pathString[i]);
                }
            }
        }
        System.out.println("stack");
        String finalPath = createPath(stack);
        System.out.println("finalpath : " + finalPath);
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }

        return finalPath;
    }

    private static String createPath(Stack<String> stack) {
        String finalPath = "";
        while(!stack.isEmpty()){
            String pop = stack.pop();
            System.out.println(pop);
            createPath(stack);
            finalPath.concat("/");
            finalPath.concat(pop);
        }
        return finalPath;
    }
}
