class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int maxLength=0;
        int start=0;
        for(int end=0;end<s.length();end++){
            while(seen.contains(s.charAt(end))){
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(s.charAt(end));
            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
}