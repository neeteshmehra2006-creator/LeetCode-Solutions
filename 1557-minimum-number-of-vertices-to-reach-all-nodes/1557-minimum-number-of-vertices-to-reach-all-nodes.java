class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    int []InDeg = new int[n];
     for (List<Integer> li : edges) {
            InDeg[li.get(1)]++;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (InDeg[i] == 0) {
                res.add(i);
            }
        }
    return res;
    }
}