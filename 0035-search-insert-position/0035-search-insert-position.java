class Solution {
    public int searchInsert(int[] a, int x) {
        int l=0;
        int r=a.length-1;
        int mid=0;
        while(l<=r){
            mid=l+((r-l)/2);
            if(x==a[mid]){
                return mid;
            }
            else if(x>a[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;

    }
}