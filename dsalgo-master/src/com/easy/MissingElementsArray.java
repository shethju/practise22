package com.easy;

import java.util.ArrayList;
import java.util.List;

public class MissingElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elements[] = {4,3,2,7,8,2,3,1};
		List<Integer> result = findDisappearedNumbers(elements);
		for (int i : result) {
			System.out.print(i + ",");
		}
	}
	
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int numsSize = nums.length;
        for (int i=0; i < numsSize; i++) {
        		int element = nums[i];
        		int index = Math.abs(element);
        		if (nums[index-1] > 0) {
        			nums[index-1] *= -1;
        		}
        }
        for (int i=0; i < numsSize; i++) {
        		if (nums[i] > 0) {
        			result.add(i+1);
        		}
        }
        return result;
    }
}
