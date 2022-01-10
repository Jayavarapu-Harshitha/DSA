class Solution {
    public int longestPalindrome(String[] words) {
       HashMap<String,Integer>  h=new HashMap<>();
       for(int i=0;i<words.length;i++)
       {
           if(h.get(words[i])==null){
               h.put(words[i],1);
           }
           else
               h.put(words[i],h.get(words[i])+1);
       }
        int result=0;
        for(Map.Entry m :h.entrySet()){
            String key=(String)m.getKey();
            String  rev=String.valueOf(key.charAt(1))+String.valueOf(key.charAt(0));
            int val=((int)m.getValue());
            if(h.get(rev)!=null){
                if(key.equals(rev)){
                    if(h.get(rev)%2==0)
                    {
                        result+=h.get(rev);
                        h.put(key,0);
                    }
                    else{
                        result+=h.get(rev)-1;
                        h.put(rev,1);
                    }
                }
                else{
                    result+=Math.min(h.get(rev),h.get(key))*2;
                    h.put(key,0);
                    h.put(rev,0);
                }
            }
           
        }
        result=result*2;
        int max=0;
        for(Map.Entry m:h.entrySet()){
            String key=(String)m.getKey();
            String rev=String.valueOf(key.charAt(1))+String.valueOf(key.charAt(0));
            int val=((int)m.getValue());
            
            if(key.equals(rev)){
                if(val>max)
                    max=val;
            }
        }
        result+=(max*2);
        return result;
    }
}
