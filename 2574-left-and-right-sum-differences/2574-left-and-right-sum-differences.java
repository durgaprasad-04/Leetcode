class Solution {
    public int[] leftRightDifference(int[] nums) {

        if(nums.length==1){
            int [] ans={0};
            return ans;
        }
        int [] psum= new int[nums.length];
           int [] ssum= new int[nums.length];
           int i,j;
           int sum1=0;
           int sum2=0;
            for(i=0,j=nums.length-1;i<=nums.length-1;i++,j--){
            sum1=sum1+nums[i];
            psum[i]=sum1;
            sum2=sum2+nums[j];
            ssum[j]=sum2;
           }
           int [] ans= new int [nums.length];
           ans[0]=ssum[1];
           ans[ans.length-1]=psum[ans.length-2];
           for(i=1;i<=nums.length-2;i++){
            ans[i]=Math.abs(psum[i-1]-ssum[i+1]);
           }
           return ans;

    }
}
