class Solution {
    public boolean isPalindrome(int x) {
        char[] arr=String.valueOf(x).toCharArray();
        int i =0;
                int j = arr.length-1;
        while(i<j){
            if(arr[i]==arr[j]){
            return true;
        }
        i++;
        j--;
        }
        return false;
    }
}