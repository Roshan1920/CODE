class Solution {
    public List<List<String>> partition(String s) 
    {
        List<List<String>> ans = new ArrayList<>();
        //ans-it will store the results
        //helper will store all the paths reached.
        helper(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void helper(String s, int index, List<String> ds, List<List<String>> ans) 
    {
        if(s.isEmpty()) 
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < s.length(); i++) 
        {
            String current = s.substring(0, i+1);
            if(isPalindrome(current)) 
            {
                ds.add(current);
                helper(s.substring(i+1), index + 1, ds, ans);
                ds.remove(ds.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str)
    {
        int start = 0;
        int end = str.length() - 1;

        while(start <= end) 
        {
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
}
//     class Solution {
//     public List<List<String>> partition(String s) {
//         List<List<String>> res = new ArrayList<>();
//         List<String> path = new ArrayList<>();
//         func(0, s,path,res);
//         return res;
//     }

//     void func(String s, int index, List<String> path, List<List<String>> res) {
//         if(index==s.length()) {
//             res.add(new ArrayList<>(path));
//             return;
//         }

//         for(int i = index; i < s.length(); ++i) {
//             if(isPalindrome(s,index,i)) {
//                 path.add(s.substring(index,i+1));
//                 func(i=1,s,path,res);
//                 path.remove(ds.size() - 1);
//             }
//         }
//     }

//  boolean isPalindrome(String s, int start, int end) {
       
//         while(start <= end) {
//             if(s.charAt(start++) != s.charAt(end--)) return false;
//         }
//         return true;
//     }
// }