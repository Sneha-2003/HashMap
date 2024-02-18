class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left_par=new Stack<>();
        Stack<Integer> star=new Stack<>();

        for(int i=0;i<s.length();i++)
        {  char ch=s.charAt(i);
            if(ch=='(')
            left_par.add(i);
            else if(ch=='*')
            star.add(i);
            else
            {
                if(left_par.size()>0)
                left_par.pop();
                else if(star.size()>0)
                star.pop();
                else
                return false;
            }
        }

        while(left_par.size()>0)
        {
            if(star.size()>0)
            {
                 if(star.pop()< left_par.pop())
                 return false;
            }
            else
            return false;
        }

        return true;


    }
}