import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String[]s={"5","-2","4","C","D","9","+","+"};
        String[]s2={"5","2","C","D","+"};
        System.out.println(calPoints(s2));
    }
    public static int calPoints(String[] ops) {
        int count=0;
        int sum=0;
        int pop=0;
        int size;
        ArrayList<Integer>list =  new ArrayList<>();
        for(int i=0;i<ops.length;i++){
            size=list.size();
           // System.out.println(ops[i]);
            if("C".equals(ops[i])){

                pop=list.remove(size-1);
                sum=sum-pop;
            }else if("D".equals(ops[i])){
                pop=list.get(size-1);
                sum=sum+(2*pop);
                list.add(2*pop);

            }else if("+".equals(ops[i])){
                pop=list.get(size-1);
                int pop2=list.get(size-2);
                sum=sum+pop+pop2;
                list.add(pop+pop2);

            }else{
                list.add(Integer.parseInt(ops[i]));
                sum=sum+Integer.parseInt(ops[i]);
            }
        }
        for(int i:list){
           // System.out.println(i);
        }
       // System.out.println("sum" + sum);

        return sum;
    }
}
