class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>>li = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int i = 0; i<arr.length-1; i++){
         min = Math.min(min,arr[i+1]-arr[i]);
        } 

        for(int i = 0; i<arr.length-1; i++){
            if((arr[i+1]-arr[i])==min){

                List<Integer>ans = new ArrayList<>();

                ans.add(arr[i]);
                ans.add(arr[i+1]);

                li.add(ans);
            }
        }
        return li;
    }
}