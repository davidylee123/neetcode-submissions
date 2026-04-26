class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if(!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
}

/*
Time: O(n) Process all elements in the worst case. Insert is O(1)
Space: O(n) Store every element in nums
*/