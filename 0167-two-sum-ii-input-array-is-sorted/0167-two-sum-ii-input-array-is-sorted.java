class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int n = numbers.length;
    int low = 0;
    int high = n-1;
    int arr[] = new int[2];

    while(low<=high){
        int sum = numbers[low] + numbers[high];

        if(sum == target){
            arr[0] = low+1;
            arr[1] = high+1;
            return arr;
        }
        else if(sum > target){
            high--;
        }
        else low++;
    }
    return arr;
    }
}