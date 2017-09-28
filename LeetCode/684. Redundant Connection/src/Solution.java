import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[][]edges={{5,2}, {3,4}, {4,3},{5,3},{1,3}};
//        [[5,2],[3,4],[4,3],[5,3],[1,3]]
        System.out.println(Arrays.toString(findRedundantConnection(edges)));
    }
    public static int[] findRedundantConnection(int[][] edges) {
        int[]result=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        int length=edges.length;
        System.out.println(length);
        for(int i=0;i<length;i++){
            if(map.containsKey(edges[i][1])){
                result[0]=edges[i][0];
                result[1]=edges[i][1];
            }else if(map.containsKey(edges[i][0])){
                if(map.get(edges[i][0])==edges[i][1]){
                    result[0]=edges[i][0];
                    result[1]=edges[i][1];
                }
            }else{
                map.put(edges[i][1],edges[i][0]);
            }
        }
        return result;
    }
}
