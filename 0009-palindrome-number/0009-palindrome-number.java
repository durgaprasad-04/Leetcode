class Solution {
    public static boolean isPalindrome(int x) {
     
            String str= Integer.toString(x);
            String reversed= new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
    }
               public static void main(String[] args){
                System.out.println(isPalindrome(121));
                System.out.println(isPalindrome(-121));
                System.out.println(isPalindrome(10));
                System.out.println(isPalindrome(01));
        }
    }
