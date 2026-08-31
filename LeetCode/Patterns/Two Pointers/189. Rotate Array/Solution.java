class Solution {
    public void rotate(int[] nums, int k) {

        // for(int j=0; j<k;j++){
        //    int last = nums[nums.length-1];
        //     for(int i=nums.length-1;i>0;i--){
        //         nums[i] = nums[i-1];
        //     }
        //     nums[0]=last;
        // }

        int n=nums.length;
        int[] result = new int[n];
        for(int i=0 ; i<n; i++){
            result[(i+k)%n] = nums[i];
        }
        for(int i=0 ; i<n; i++){
            nums[i]=result[i];
        }
    }
}