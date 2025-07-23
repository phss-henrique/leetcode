class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 1 || s == null) return "";

        int start = 0, end = 0;

        for(int i =0; i<s.length();i++){
            
            int oddlen = expandAroundTheCenter(s,i,i);

            int evenlen = expandAroundTheCenter(s,i,i+1);        

            int size = Math.max(oddlen,evenlen);

            if(size > end-start){

                start = i-(size-1)/2;
                end = i + size/2;
                
            }        
        }
        return s.substring(start, end+1);
    
    
    }
    private int expandAroundTheCenter(String s,int left,int right){
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            right++;
            left--;
            }
            return right - left - 1;
    }
    
}
