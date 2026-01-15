class Solution {
    public String reverseWords(String str) {
        String[] s = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length;i++){
            StringBuilder res = new StringBuilder(s[i]);
            ans.append(res.reverse()+" ");
        }
        return ans.toString().trim();
        
        
    }
}