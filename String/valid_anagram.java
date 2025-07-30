// LeetCode 242. Valid Anagram
// Difficulty: Easy
// Link: https://leetcode.com/problems/valid-anagram/

class Solution {
  public boolean isAnagram(String s, String t) {

    // Step 1: Remove spaces and convert to lowercase
    s = s.replaceAll("\\s", "").toLowerCase();
    t = t.replaceAll("\\s", "").toLowerCase();

    if (s.length() != t.length()) {
      return false;
    }
    char arr1[] = s.toCharArray();
    char arr2[] = t.toCharArray();

    // sort
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);

  }
}