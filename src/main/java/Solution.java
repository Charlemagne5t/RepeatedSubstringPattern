public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.length() % (i + 1) == 0) {
                String currentSubstring = s.substring(0, i + 1);
                int subStringLength = i + 1;
                boolean isTrue = true;
                for (int left = subStringLength, right = left + subStringLength; right <= s.length(); left += subStringLength, right+=subStringLength) {
                    String testSubstring = s.substring(left, right);
                    if(!testSubstring.equals(currentSubstring)){
                        isTrue = false;
                        break;
                    }
                }
                if(isTrue){
                    return  true;
                }

            }
        }

        return false;
    }
}
