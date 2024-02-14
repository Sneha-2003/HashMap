class Solution {
    public boolean checkValidString(String s) { 
        Stack<Integer> b=new Stack<>();
        Stack<Integer> star=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
             if(s.charAt(i)=='(')
             b.add(i);
             else if(s.charAt(i)=='*')
             star.add(i);
             else
             {
                 if(b.size()>0)
             b.pop();
             else if(star.size()>0)
             star.pop();
             else 
             return false;
             }
        }
       while(b.size()>0)
       {
           if(star.size()>0)
           {
                        if(  star.pop() < b.pop())
                        return false;
           }
           else
           return false;
       }
      
      return true;
        
    }
}