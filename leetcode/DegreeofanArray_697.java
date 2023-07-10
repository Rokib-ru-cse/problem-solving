package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DegreeofanArray_697 {
    public static int findShortestSubArray(int[] nums) {
        List<Integer> container = new ArrayList<>();
        int degree = degree(nums,container);
        //System.out.println("degree " + container);
//1, 2, 2, 3, 1, 4, 2

        int minSize = Integer.MAX_VALUE;

        for (int val: container) {
            int leftpointer = 0;
            int rightpointer = nums.length-1;
            while (nums[leftpointer]!=val){
                leftpointer++;
            }
            while (nums[rightpointer]!=val){
                rightpointer--;
            }
            if(rightpointer-leftpointer+1<minSize){
                minSize = rightpointer-leftpointer+1;
            }
        }
        /*
        1, 2, 2, 3, 1, 4, 2,1
        0  1  2  3  4  5  6 7
        right-left+1

         */
        return minSize;
    }

    public static int degree(int[] arr, List<Integer> container) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int a : arr) {
            if (!frequency.containsKey(a)) {
                frequency.put(a, 1);
            } else {
                frequency.put(a, frequency.get(a) + 1);
            }
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> entry :
                frequency.entrySet()) {
            if (entry.getValue() >= max) {
                max = entry.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> entry :
                frequency.entrySet()) {
            if (entry.getValue() == max) {
                container.add(entry.getKey());
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }
}
