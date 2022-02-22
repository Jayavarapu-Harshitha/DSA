class Solution {
    public int majorityElement(int[] nums) { 
       HashMap<Integer,Integer> hs=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
        if(!(hs.containsKey(nums[i])))
        {
            hs.put(nums[i],1);
        }
        else
            hs.put(nums[i],hs.get(nums[i])+1);
        }
         for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
        if(entry.getValue()>(nums.length)/2){
            c = entry.getKey();
        }
         }
          return c;  
    }
}
