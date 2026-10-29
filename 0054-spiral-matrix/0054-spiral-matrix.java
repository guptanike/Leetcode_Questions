class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int minR = 0;
        int maxR = arr.length - 1;
        int minC = 0;
        int maxC = arr[0].length - 1;
        int totalElement = arr.length * arr[0].length;
        int count = 0;
        while (count < totalElement) {
            for (int i = minC; i <= maxC && count < totalElement; i++) {
                list.add(arr[minR][i]);
                count++;
            }
            minR++;
            for (int i = minR; i <= maxR && count < totalElement; i++) {
                list.add(arr[i][maxC]);
                count++;
            }
            maxC--;
            for (int i = maxC; i >= minC && count < totalElement; i--) {
                list.add(arr[maxR][i]);
                count++;
            }
            maxR--;
            for (int i = maxR; i >= minR && count < totalElement; i--) {
                list.add(arr[i][minC]);
                count++;
            }
            minC++;
        }
        return list;
    }
}