class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = Arrays.stream(piles).max().getAsInt();
        while(low<high){
            int mid = (low+high)/2;

            if(canEatAll(piles,h,mid)){
                high=mid;
            } else{
                low=mid+1;
            }
        }
        return low;
    }
    private boolean canEatAll(int[] piles, int h , int k){
        int totalHours=0;
        for(int pile:piles){
            totalHours+=(pile+k-1)/k;
        }
        return totalHours<=h;
    }
}