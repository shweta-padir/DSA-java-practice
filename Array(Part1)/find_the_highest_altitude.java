/*🔹 Step-by-Step Logic:

Start at altitude 0 (this is given in the problem).

Maintain a variable currentAltitude to track where the biker is right now.

Maintain another variable maxAltitude to track the highest altitude reached.

Loop through each element in the gain array:

Add the current gain[i] to currentAltitude.

Update maxAltitude if currentAltitude is greater than the current maxAltitude.

After the loop ends, maxAltitude will hold the answer.

🔹 Dry Run Example:

Input: gain = [-5, 1, 5, 0, -7]

Start: currentAltitude = 0, maxAltitude = 0

Step 1: 0 + (-5) = -5 → max = 0

Step 2: -5 + 1 = -4 → max = 0

Step 3: -4 + 5 = 1 → max = 1

Step 4: 1 + 0 = 1 → max = 1

Step 5: 1 + (-7) = -6 → max = 1

Answer = 1
*/

class Solution {
  public int largestAltitude(int[] gain) {

    int start = 0;
    int max = 0;
    for (int i = 0; i < gain.length; i++) {
      start = start + gain[i];
      max = Math.max(start, max);
    }
    return max;

  }
}