// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int runnigSum = 0;
        int maxLengthOfArray = 0;
        
        for(int i=0 ;i<nums.length; i++){
            if(nums[i] == 0){
                runnigSum --;
            }
            else{
                runnigSum ++;
            }
            
            if(map.containsKey(runnigSum)){
                maxLengthOfArray = Math.max(maxLengthOfArray, i - map.get(runnigSum));
            }
            else{
                map.put(runnigSum, i);
            }
        }
        return maxLengthOfArray;
        
    }
}
