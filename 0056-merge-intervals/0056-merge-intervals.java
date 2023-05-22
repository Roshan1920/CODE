class Solution {
    public int[][] merge(int[][] intervals) {
        //Sorted all the pairs
     Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        
        List<int[]> res=new ArrayList<>();
        
        int low=intervals[0][0];
        int high=intervals[0][1];

        for(int i=1;i<intervals.length;i++)
        {
           if(intervals[i][0]<=high){
//pichle wale ke j se next wale ke i ko compare karo
               if(high<intervals[i][1])
//agar value zuada hua naye wale ka to update karo value
               high=intervals[i][1];
           }
           else{
               res.add(new int[]{low,high});
               low=intervals[i][0];
               high=intervals[i][1];
           }
        }
        res.add(new int[]{low,high});  
       return res.toArray(new int[0][]);    
    }
}