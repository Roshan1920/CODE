//App- Concatenate string 1 with itslef and check whether string 2 is a substring of that.


class Solution {
    public boolean rotateString(String s, String goal) {
        if(s ==null || goal == null){
            return false;
        }
        if(s.length() != goal.length()) return false;
      
        String p=s+s;
        int x = p.indexOf(goal);
        if(x==-1){
            return false;
        }
        return true;
    }
}