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
  
 public List<List<Integer>> combine(int n, int k) 
 {
     List<List<Integer>> subset = new ArrayList();
        com(subset,1,new ArrayList(),n,k);
        return subset;
        
    }
    
public void com( List<List<Integer>> subset,int index,List<Integer> current,int n,int k){
               
                if(current.size()==k){
                  subset.add(new ArrayList(current));
                    return;
                }
              for(int i=index;i<=n;i++){
                    current.add(i);
                    com(subset,i+1,current,n,k);
                    current.remove(current.size()-1);           
                } 
    }
 }