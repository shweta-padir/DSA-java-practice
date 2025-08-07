/* 
✅ Problem: Maximum Number of Words Found in Sentences (LeetCode #2114)
🔹 Problem Statement:
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words found in any single sentence.

🔸 Example:
text
Copy
Edit
Input: sentences = [
  "alice and bob love leetcode", 
  "i think so too", 
  "this is great thanks very much"
]

Output: 6

Explanation:
- Sentence 1 has 5 words
- Sentence 2 has 4 words
- Sentence 3 has 6 words → max = 6
*/

class Solution {
  public int mostWordsFound(String[] sentences) {

    int max = 0;
    for (String sentence : sentences) {
      int wordcount = sentence.split(" ").length;
      max = Math.max(max, wordcount);
    }
    return max;

  }
}
