/*  Approach 1
1. get all subset
2. insert in final ans having subset size k
//Example :- n = 3 & k = 2 i.e. [1,2,3]
1. subset = [],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]
2. subset having size, k i.e. [1,2],[1,3],[2,3]

T.C :- 2^n-for generating all subsets and  * 2^n for looping to get k size subset from 2^n subsets,i.e 2^n*2^n.
*/


//Approach 2, in order to not traverse via. all we can check simultaneously , if any subset is of size k
//if we get any such sibset we will directly store it.
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Select(1,n,0,k,ans,subset);
        return ans;
    }
   public static void Select(int start, int n, int size,int k,List<List<Integer>> ans, List<Integer> subset)
    {
        if(start>n){
            if(size==k){
                ans.add(new ArrayList(subset));
            }
            return;
        }
        
        //to include
        subset.add(start);
        Select(start+1,n,size+1,k,ans,subset);
        
        //to exclude
        subset.remove(subset.size()-1);
        Select(start+1,n,size,k,ans,subset);
    }
}
//TC- O(2^n)