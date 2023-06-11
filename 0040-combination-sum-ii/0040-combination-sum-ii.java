class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> subset = new ArrayList();
        dfs(subset,0,candidates,new ArrayList(),target);
        return subset;
    }  
    
     void dfs( List<List<Integer>> subset,int index,int[] candidates,List<Integer> current, int target){
                 
                 if(target<0)return;
                 if(target==0){
                      subset.add(new ArrayList(current));
                      return;
                 }
         
                for(int i=index;i<candidates.length;i++){
                    if(i>index && candidates[i]==candidates[i-1])continue;// condition added
                    current.add(candidates[i]);
                    dfs(subset,i+1,candidates, current,target-candidates[i]);
                    current.remove(current.size()-1);           
                } 
    }
    }