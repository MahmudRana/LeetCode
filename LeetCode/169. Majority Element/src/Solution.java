import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int[]a = {2,3,1,1,1};
        System.out.println(majorityElement(a));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hashMap = new HashMap<>();
        int length = nums.length;
        int majorityElement = nums[0];
        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
            if(hashMap.get(nums[i])>length/2){
                majorityElement = nums[i];
                break;
            }
        }
        return majorityElement;
    }
}