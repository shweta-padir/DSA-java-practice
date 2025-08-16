class Solution {
    public int firstUniqChar(String s) {

        int count[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
           count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++)
        {
            if(count[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;

    }
}

/* 
Input: s = "leetcode"
Output: 0
Explanation: 'l' is the first character that appears only once.
vbnet
Copy
Edit
Input: s = "loveleetcode"
Output: 2
Explanation: 'v' is the first single-occurrence character.*/