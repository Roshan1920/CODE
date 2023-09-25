/*   SIMILAR TO PASCAL TRIANGLE

                  N                                                           2(1)                  FILLED (REMAINING)
      N-1/2              N-1/2                                        1/2(1/4)    1/2(1/4)          FILLED (REMAINING)        
((N-1/2)-1)/2  ((N-1/2)-1)/2+((N-1/2)-1)/2       ((N-1/2)-1)/2     1/8       1/8+1/8      1/8       FILLED (REMAINING)
*/


class Solution{
public double champagneTower(int poured, int queryRow, int queryGlass) {
	if (poured == 0)
		return 0;
	
	var prevRow = new ArrayList<>(List.of((double) poured));

	while (queryRow-- > 0) {
		var champagneInEnds = Math.max(0, (prevRow.get(0) - 1) / 2);  // min champagne can be 0
		var currentRow = new ArrayList<>(List.of(champagneInEnds)); // list with first glass

		for (var i = 1; i < prevRow.size(); i++)
			currentRow.add(Math.max(0, (prevRow.get(i - 1) - 1) / 2) + // flow from top-left glass
						   Math.max(0, (prevRow.get(i) - 1) / 2));     // flow from top-right glass

		currentRow.add(champagneInEnds); // last glass
		prevRow = currentRow;
	}
	
	return Math.min(1, prevRow.get(queryGlass)); // max champagne can be 1
}

}

//                                          APPROACH USING DP                                       //
// class Solution {
//   public double champagneTower(int poured, int query_row, int query_glass) {
//     double[][] dp = new double[query_row + 1][query_row + 1];
//     dp[0][0] = poured;

//     for (int i = 0; i < query_row; ++i)
//       for (int j = 0; j <= i; ++j)
//         if (dp[i][j] > 1) {
//           dp[i + 1][j] += (dp[i][j] - 1) / 2.0;
//           dp[i + 1][j + 1] += (dp[i][j] - 1) / 2.0;
//         }
//     return Math.min(1.0, dp[query_row][query_glass]);
//   }
// }
