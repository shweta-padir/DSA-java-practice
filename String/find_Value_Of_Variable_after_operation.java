class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String op : operations) {
            if(op.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
/* You are given a list of operations (strings). Each operation modifies a variable x, starting from x = 0.

"++X" or "X++" → increase x by 1

"--X" or "X--" → decrease x by 1

Return the final value of x after performing all operations.

Example:

Input:

operations = ["--X","X++","X++"]


Process:

Start: x = 0

"--X" → x = -1

"X++" → x = 0

"X++" → x = 1

Output:

1

Step-by-step Logic:

Start with x = 0.

Loop through each operation.

If the operation contains "++", then increment x.

If the operation contains "--", then decrement x.

At the end, return the final value of x.  */
