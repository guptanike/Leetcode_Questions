class Solution {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        keypad(digits, "", list);
        return list;
    }
    public static void keypad(String question, String answer, List<String> list){
        if (question.length() == 0) {
            list.add(answer);
            return;
        }
        char ch = question.charAt(0);
        String s = key[ch - '0'];
        for(int i = 0; i < s.length(); i++){
            keypad(question.substring(1), answer + s.charAt(i), list);
        }
    }
}