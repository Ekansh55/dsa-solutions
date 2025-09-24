class Solution {
    public int strStr(String h, String n) {

        int a = h.length();
        int b = n.length();

        if(b==0) return 0;

        for(int i=0;i<=a-b;i++){
            if (h.substring(i, i + b).equals(n)){
                return i;
            }
            
        }
        return -1;
        
    }
}