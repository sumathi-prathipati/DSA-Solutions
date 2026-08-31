class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums, 0,n-1);
        reverse(nums, 0,k-1);
        reverse(nums, k,n-1);
    }
        public void reverse(int[] nums, int left, int right ){
            while(left<right){
                int temp = nums[left];
                nums[left]= nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
}

  // for(int j=0; j<k;j++){
        //    int last = nums[nums.length-1];
        //     for(int i=nums.length-1;i>0;i--){
        //         nums[i] = nums[i-1];
        //     }
        //     nums[0]=last;
        // }

        // ---------------------------

        // int n=nums.length;
        // int[] result = new int[n];
        // for(int i=0 ; i<n; i++){
        //     result[(i+k)%n] = nums[i];
        // }
        // for(int i=0 ; i<n; i++){
        //     nums[i]=result[i];
        // }

        // --------------------------