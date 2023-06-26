//Iterative Approach
/*
class Solution{
public List<List<Integer>> subsets(int[] nums){
List<List<Integer>> res = new ArrayList();
res.add(new ArrayList());

for(int nums:nums){
 int n= res. size();

 for(int j=1;i<n;i++){
  List<Integer> temp = new ArrayList(res.get(i));
  temp.add(num); 
  }
 }
return res;
}
}

*/
//RECCURSIVE (BACKTRACKING) Approach
class Solution{
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList();
        generateSubsets(0,nums,new ArrayList(), res);
        return res;
    }
     void generateSubsets(int index, int [] nums,   List<Integer> curr,   List<List<Integer>> res){
     res.add(new ArrayList(curr));
        
        for(int i=index; i<nums.length;i++){  //Saare elements mein iterate kiya 
        curr.add(nums[i]);                    // Uss element ko list mei add kiya
        generateSubsets(i+1,nums,curr,res);   // Uske jitne subsets ho skte hai unhe v curr list m add kiya
        curr.remove(curr.size()-1);           //element ko remove kar diya taki backtrack  ho ske aur naya                                                   // __subset ban sake
        }
    }
}