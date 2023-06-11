class Solution {
   
public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> subset = new ArrayList();
        com(subset,0,candidates,new ArrayList(),target);
        return subset;
    }
    
     void com( List<List<Integer>> subset,int index,int[] candidates,List<Integer> current,int target){
                
                if(target<0)return;
                if(target==0){
                    subset.add(new ArrayList(current)); 
                    return;
                }
               
                for(int i=index;i<candidates.length;i++){
                    current.add(candidates[i]);
                    com(subset,i,candidates, current,target-candidates[i]);
                    current.remove(current.size()-1);           
                } 
    }
}