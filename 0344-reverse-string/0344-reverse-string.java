class Solution {
    public void reverseString(char[] s) {
        
        if(s==null){
            return ;
        }
        int i=0;
        int j= s.length -1;
        while(i<j){
            char a = s[i];
            s[i]=s[j];
            s[j]= a;
            
            i++;
            j--;
                
        }
        }
    }
