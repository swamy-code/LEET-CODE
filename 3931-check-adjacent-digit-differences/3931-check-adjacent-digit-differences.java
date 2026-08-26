class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char[] arr = s.toCharArray();
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i-1] - arr[i]) > 2) return false;

        }
        return true;
    }
}