/*Step 1: Understand the Problem (Very Easy Language)
Imagine you are playing a game with a number.

You are given a number num.
Your goal is to make this number zero by doing the following:

If the number is even → divide it by 2

If the number is odd → subtract 1

You can repeat these steps, and you must count how many steps it takes to reach zero.

📦 Example:
Let’s say num = 14
Your steps will be:

Copy
Edit
14 → even → 14 / 2 = 7
 7 → odd → 7 - 1 = 6
 6 → even → 6 / 2 = 3
 3 → odd → 3 - 1 = 2
 2 → even → 2 / 2 = 1
 1 → odd → 1 - 1 = 0
✅ Total steps = 6

So the output will be: 6

⚙️ Step 2: Logic Behind the Solution
We just repeat:

If even → divide by 2

If odd → subtract 1

And we count the number of times we do this until the number becomes 0.

This is a very simple loop problem.
*/

class Solution {
  public int numberOfSteps(int num) {
    int steps = 0;

    while (num > 0) {
      if (num % 2 == 0) {
        num = num / 2;
      } else if (num % 2 != 0) {
        num = num - 1;
      }
      steps++;
    }
    return steps;
  }
}