class Solution {
    public boolean containsDuplicate(int[] nums) {
        // loop through list
        //keep count in a dictionary
        //if count is more than 1 return true
        Map<Integer, Integer> countHashMap = new HashMap<>();
        boolean result = true;
        for(int i = 0; i < nums.length; i++){
           int count = Collections.frequency(Arrays.asList(nums), nums[i]);
           if(count > 1){
            result = true;
            break;
           }else{
            result = false;
           }
        }
       return result;
    }
}