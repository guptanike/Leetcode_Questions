class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        lexicographic(n, 0, list);
        return list;
    }
    public static void lexicographic(int n, int c, List<Integer> list){
        if(c > n) {
            return;
        }
        if(c != 0) {
            list.add(c);
        }
        int i = 0;
        if(c == 0) {
            i = 1;
        }
        for(; i <= 9; i++) {
            lexicographic(n, c * 10 + i, list);
        }
    }
}