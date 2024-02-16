import java.util.ArrayList;
import java.util.List;

class Solution {
    String[] keypad = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        List<String> rres = getKPC(ros);
        List<String> mres = new ArrayList<>();

        String codeforKp = keypad[ch - '0']; 
        for (int i = 0; i < codeforKp.length(); i++) {
            char chcode = codeforKp.charAt(i);

            for (String rstr : rres) {
                mres.add(chcode + rstr);
            }
        }
        return mres;
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()) return ans; 

        ans = getKPC(digits);
        return ans;
    }
}