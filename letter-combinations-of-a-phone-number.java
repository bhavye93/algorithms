// 17. Letter Combinations of a Phone Number
// Medium

// 3485

// 383

// Add to List

// Share
// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

// A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



// Example:

// Input: "23"
// Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

class Solution {
    public List<String> letterCombinations(String digits) {
     
            List<String> result = new ArrayList<>();
            
            if(digits == null || digits.length() == 0) {
                    return result;
            }
            
            letterCombinationsUtil(result, digits, 0, "");
            return result;                     
    }
        
        public void letterCombinationsUtil(List<String> result, String digits, int current, String comb) {
                if(digits.length() == current) {
                        result.add(comb);
                        return;
                }
                
                String s = mapping(digits.charAt(current) - '0'); 
                
                for( int i = 0; i < s.length(); i++) {
                        letterCombinationsUtil(result, digits, current+1, comb + s.charAt(i));
                }
        }
        
        
    public static String mapping(int a) {
             switch(a) {
                        case 2: return "abc";
                        case 3: return "def";
                        case 4: return "ghi";
                        case 5: return "jkl";
                        case 6: return "mno";
                        case 7: return "pqrs";
                        case 8: return "tuv";
                        case 9: return "wxyz";
                        default: return "";
                }
    }
}
