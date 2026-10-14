class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        Parantheses(n, 0, 0, "", list);
        return list;
    }
    public static void Parantheses(int n, int open, int closed, String ans, List<String> list) {
        if (open == n && closed == n) {
            list.add(ans);
            return;
        }
        if (open > n || closed > open) {
            return;
        }
        Parantheses(n, open + 1, closed, ans + "(", list);
        Parantheses(n, open, closed + 1, ans + ")", list);
    }
}