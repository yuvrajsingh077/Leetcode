class Solution {
public:
    int maxProfit(vector<int>& arr) {
        int mini=arr[0],profit=0;
        for(int i=1;i<arr.size();i++){
            if(arr[i-1]>arr[i]){
                mini=min(mini,arr[i]);
            }
            else{
                profit=max(profit,arr[i]-mini);
            }
        }
        return profit;
    }
};