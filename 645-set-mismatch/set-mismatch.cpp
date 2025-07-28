class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int n = nums.size(); 
        sort(nums.begin(),nums.end());

        vector<int> arr;
        int duplicate;
        int sum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                duplicate = nums[i];
            }
            sum += nums[i]; // 9
        }
        int actual = (n*(n+1))/2;
        int missing = actual-(sum-duplicate);
        arr.push_back(duplicate);
        arr.push_back(missing);
        return arr;
    }
};