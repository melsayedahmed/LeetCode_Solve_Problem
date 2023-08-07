// Link in Leetcode
// https://leetcode.com/problems/sort-an-array/


// (----------------------------- THE ANSWER -----------------------------)


class Solution {
    public int[] sortArray(int[] nums) {
        // call the merge sort function
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    
    // define the merge function
    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right-left+1];
        int i = left, j = mid+1, k = 0;
        while (i <= mid && j <= right) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        for (i = left, k = 0; i <= right; i++, k++) {
            nums[i] = temp[k];
        }
    }
    
    // define the merge sort function
    private void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
    }
}
