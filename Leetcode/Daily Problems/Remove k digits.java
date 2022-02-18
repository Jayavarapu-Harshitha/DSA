class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length())
            return "0";
        Stack<Character> st=new Stack();
      int i=0;
        while(i<num.length())
       {
            while(k>0 && !st.isEmpty() && st.peek() > num.charAt(i))
            {
              st.pop();
                k--;
            }
                st.push(num.charAt(i));
                i++;
       }
        
     while(k>0)
     {
         st.pop();
         k--;
     }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            char current_char=st.pop();
            sb.append(current_char);
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
