class Solution {
public:
    int removeElement(vector<int>& arr, int val) {
        int k = arr.size();
        if (k == 0) return 0;

        sort(arr.begin(), arr.end());

        vector<int> ans;
        

        for (int i = 0; i < k; i++) {
            if (arr[i] != val) {
                ans.push_back(arr[i]);
            }
        }

        arr = ans;

        return arr.size();

        
    }
};