import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s1="19:34";
        String s2="23:59";
        System.out.println("res "+nextClosestTime(s2));
    }
    public static String nextClosestTime(String time) {
        char[]a=new char[4];

        String finalTime="aa";
        int k=0;
        for(int i=0;i<time.length();i++){
            if(time.charAt(i)!=':'){
                a[k]=(time.charAt(i));
                k++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a[0]);
        stringBuilder.append(a[1]);
        stringBuilder.append(a[2]);
        stringBuilder.append(a[3]);


        int init=Integer.parseInt(stringBuilder.toString());
       // String temp="";
        int min=Integer.MAX_VALUE;
        int result=0;
        int diff=0;
        char[]temp=new char[4];
        int t;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int x=0;x<4;x++){
                    for(int l=0;l<4;l++){
                        temp[0]=a[i];
                        temp[1]=a[j];
                        temp[2]=a[x];
                        temp[3]=a[l];

                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(temp[0]);
                        stringBuilder2.append(temp[1]);
                        stringBuilder2.append(temp[2]);
                        stringBuilder2.append(temp[3]);


                        t = Integer.parseInt(stringBuilder2.toString());
                        if(t>2460){

                        }
                        else if(t>init){
                             diff = t-init;
                            if(diff<min){
                                min=diff;
                                result=t;
                            }
                        }else if(t<init){
                            diff=t+(2460-init);
                            if(diff<min){
                                min=diff;
                                result=t;
                            }
                        }


                    }
                }
            }

        }
//        System.out.println(Arrays.toString(a));
        System.out.println("min" + result);
        char[]res = ("" + result).toCharArray();
//        System.out.println(res[0]);
        String colon = ":";

        stringBuilder.append(res[0]);
        stringBuilder.append(res[1]);
        stringBuilder.append(colon);
        stringBuilder.append(res[2]);
        stringBuilder.append(res[3]);

        return stringBuilder.toString();
    }
}
