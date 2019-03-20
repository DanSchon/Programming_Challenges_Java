package interviewProblems;

import java.util.Arrays;

public class SortingArray {

//	public static void main(String[] args) {
//		
//		int[] arr = {9,8,4,5,6,1,2,3};
//		
//		int temp;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j= i+1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					//swap them
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//		for (int i : arr) {
//			System.out.println(i);
//		}
//		
//		
//	}
	
//	public static void main(String[] args) {
//		int[] arr = {8,9,7,6,5,4,3,1,2};
//		
//		int temp;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i+1; j<arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//	}
	
	public static void main(String[] args) {
		int[] arr = {2,1,4,3,5};
		
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
}
