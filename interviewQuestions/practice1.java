package interviewQuestions;

/*
A list of ranges contains the start and end values of continuous ranges of integers. 
For example, [1, 4] denotes all integers in the range 1 to 4 or [1, 2, 3, 4]. 
Divide the ranges into 2 groups such that any 2 ranges that have at least one common integer belong to the same group.

Given the list of ranges, find the number of ways to distribute these ranges into 2 groups that satisfy the constraint and each group has at least one range. 
Since the answer can be large, compute it modulo 109+7109+7. Assume its already sorted

Example:
Consider ranges = [[1, 5], [3, 8], [10, 15], [13, 14], [20, 100]].

    [1, 5] and [3, 8] must belong to the same group since they have common integers 3, 4, and 5.
    [10, 15] and [13, 14] must belong to the same group since they have common integers 13 and 14.
    All other ranges can be distributed independently since they do not overlap.

The 6 possible groupings:
Group 1
[1, 5], [3, 8]	
[10, 15], [13, 14], [20, 100]
[10, 15], [13, 14]
[1, 5], [3, 8], [20, 100]
[10, 15], [3, 8], [13, 14], [1, 5]
[20, 100]	

Group 2
[10, 15], [13, 14], [20, 100]
[1, 5], [3, 8]
[1, 5], [3, 8], [20, 100]	
[10, 15], [13, 14]
[20, 100]
[10, 15], [3, 8], [13, 14], [1, 5]

In all the distributions, each group has at least one range, and all ranges with common integers are in the same groups. 
There are no other distributions possible. 6mod  (109+7)=66mod(109+7)=6, so return 6.

Function Description:
Complete the function 'distributeRanges'
distributeRanges has the following parameter:
    int ranges[n][2]: the ranges
Returns:
    int: the number of ways to distribute the ranges into 2 groups



Sample Case
STDIN       FUNCTION
-----       --------
4       ->  number of rows = 4
2       ->  number of columns = 2
1 3     -> ranges = [[1, 3], [2, 5], [4, 8], [10, 20]]
2 5
4 8
10 20

Sample Output: 2

Explanation:
    - [1, 3], [2, 5] and [4, 8] must belong in the same group.
        - [1, 3] and [2, 5] have common integers 2 and 3.
        - [2, 5] and [4, 8] have common integers 4 and 5.
The ranges can be distributed in 2 ways.
    - Group 1: [1, 3], [2, 5], [4, 8] and Group2: [10, 20]
    - Group 1: [10, 20] and Group 2: [1, 3], [2, 5], [4, 8]

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice1 {
    public static void main(String[] args) {  
        List<List<Integer>> input = new ArrayList<List<Integer>>();//output should 2

        // input.add(Arrays.asList(1, 3));
        // input.add(Arrays.asList(2, 5));
        // input.add(Arrays.asList(4, 8));
        // input.add(Arrays.asList(10, 20));

        // input.add(Arrays.asList(1, 5));
        // input.add(Arrays.asList(3, 8));
        // input.add(Arrays.asList(10, 15));
        // input.add(Arrays.asList(13, 14));
        // input.add(Arrays.asList(20, 100));

        input.add(Arrays.asList(1, 2));
        // input.add(Arrays.asList(3, 4));
        // input.add(Arrays.asList(5, 6));
        // input.add(Arrays.asList(7, 8));
        // input.add(Arrays.asList(9, 10));
        // input.add(Arrays.asList(11, 12));
        // input.add(Arrays.asList(13, 14));
        // input.add(Arrays.asList(15, 16));
        // input.add(Arrays.asList(17, 18));
        // input.add(Arrays.asList(19, 20));
        System.out.println(distributeRanges(input));

     }

     public static int distributeRanges(List<List<Integer>> a) {
        int groups = 1;
        List<Integer> group = a.get(0); 
        //sort the array here
        
        for (int i = 1; i < a.size(); i++) {
            System.out.print(group);
            System.out.println(a.get(i).toString());
            if (group.get(1) >= a.get(i).get(0) && a.get(i).get(0) >= group.get(0)) {
                group.set(1, Math.max(a.get(i).get(1), group.get(1)));
                if (a.get(i).get(0) < group.get(0)) {
                    group.set(0, Math.max(a.get(i).get(0), group.get(0)));
                }
            }
            else {
                groups++;
                group = a.get(i);
            }

        }
        System.out.println(group);
        int result = 1;
        for (int i = 2; i <= groups; i++) {
            result *= i;
        }
        if (result == 1) return 0;
        return result;    
     }
  
}
