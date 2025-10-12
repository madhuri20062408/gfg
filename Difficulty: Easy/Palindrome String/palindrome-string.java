class Solution {
    boolean isPalindrome(String s) {
        // code here
        String r = new StringBuilder(s).reverse().toString();
        if(s.equals(r)){
            return true;
        }
        return false;
    }
}