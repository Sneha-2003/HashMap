class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder("");
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {   sb.reverse();
              ans.append(sb);
              ans.append(" ");
                sb=new StringBuilder("");
            }
            else
            sb.append(s.charAt(i));
        }
        //sb.reverse();

        ans.append(sb.reverse());
      return ans.toString();
    }
}