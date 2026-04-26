class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
    }
}

/*
    Time: O(nlogn) = toCharArray O(n) + Arrays.sort O(nlogn) + Arrays.equals O(n)
    Space: O(n) = Create 2 new arrays
*/
