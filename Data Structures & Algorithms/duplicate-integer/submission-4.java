class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> map = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])==false) {
                map.put(nums[i], i);
            } else {
                return true;
            }
        }
        return false;
    }
}