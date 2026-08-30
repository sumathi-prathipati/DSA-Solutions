class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int result = 0;
        int n = nums.length-1;
        for(int i=1;i<=n;i++){
            if(nums[i]==1){
                count++;
                result= Math.max(count, result);
                }
                else{
                    count=0;
                }
            }
        return result;
    }
}