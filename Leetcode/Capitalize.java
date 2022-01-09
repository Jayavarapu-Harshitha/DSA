
import java.util.*;

class Solution {
    public String capitalizeTitle(String title) {  
        String s="";
        title=title.toLowerCase();
      StringTokenizer st=new StringTokenizer(title," ");
        while(st.hasMoreTokens())
        {
          String  h=st.nextToken();
            if(h.length()<=2)
            {
                s+=h.toLowerCase();
                s+=" ";
            }
            else{
                
                s+=Character.toUpperCase(h.charAt(0));
                for(int i=1;i<h.length();i++)
                {
                    s+=Character.toLowerCase(h.charAt(i));
                }
                s+=" ";
            }
            
        }
        return s.substring(0,s.length()-1);
    }
}
