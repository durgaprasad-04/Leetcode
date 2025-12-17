class Solution {
    public static int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>h = new HashMap<>();
       int i;
       int iindex=-1;
       int jindex=-1;
       for(i=0;i<nums.length;i++){
        int y=target-nums[i];
        if(h.containsKey(y)){
            iindex=h.get(y);
            jindex=i;
            break;
        
        }
        h.put(nums[i],i);
 }
    int[] a= new int[2];
    a[0]=iindex;
    a[1]=jindex;
    return a;
    }
}
    