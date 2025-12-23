class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>h = new HashMap<>();
        int ans=0;
        int x=nums.length/2;
        for(Integer i: nums){
           int y= h.getOrDefault(i,0);
           h.put(i,y+1);
           if(y+1>x){
            return i;
        
           }
        }
        return ans;

    }
}






        // int count=0;
        // int candidate=0;
        // for(int num:nums){
        //     if(count==0){
        //         candidate= num;
        //     }
        //     if(num==candidate){
        //         count++;
        //     }else {
        //         count--;
        //     }
        // }
        // return candidate;



    
