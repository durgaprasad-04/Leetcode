class Solution {
    public String minWindow(String s, String t) {
        if(s.length()< t.length()) return "";
        Map<Character, Integer> tFreq= new HashMap<>();
        for(char c: t.toCharArray()){
            tFreq.put(c, tFreq.getOrDefault(c,0)+1);
        }
        int required =tFreq.size();
        int formed=0;
        Map<Character, Integer> windowCounts = new HashMap<>();
        int left=0, right=0;
        int [] ans={-1,0,0};
        while(right<s.length()){
            char c = s.charAt(right);
            windowCounts.put(c,windowCounts.getOrDefault(c,0)+1);
            if(tFreq.containsKey(c)&& windowCounts.get(c).intValue()== tFreq.get(c).intValue()){
                formed++;
            }
            while(left<= right&& formed==required){
                if(ans[0]==-1 || right-left+1<ans[0]){
                    ans[0]=right-left+1;
                    ans[1]=left;
                    ans[2]=right;
                }
                char lChar=s.charAt(left);
                windowCounts.put(lChar,windowCounts.get(lChar)-1);
                if(tFreq.containsKey(lChar)&& windowCounts.get(lChar).intValue()<tFreq.get(lChar).intValue()){
                    formed--;
                }
                left++;
            }
            right++;
        }
        return ans[0]==-1?"": s.substring(ans[1],ans[2]+1);
    }
}