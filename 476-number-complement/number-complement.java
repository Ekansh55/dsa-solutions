class Solution {
    public int findComplement(int n) {
        if(n==1) return 0;
        int mask = 0;
        int temp = n;
        while(temp>0){
            mask = (mask<<1) | 1;
            temp >>= 1;
        }
        return mask^n;
    }
}