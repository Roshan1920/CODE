
import java.util.List;

class Solution {
    private void solve(String digits, String current, int idx, List<String> ans, String[] check) {
        if (idx >= digits.length()) {
            ans.add(current);
            return;
        }

        String m = check[digits.charAt(idx) - '0'];
        for (int i = 0; i < m.length(); i++) {
            current += m.charAt(i);
            solve(digits, current, idx + 1, ans, check);
            current = current.substring(0, current.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        String[] check = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        String current = "";
        solve(digits, current, 0, ans, check);
        return ans;
    }
}
