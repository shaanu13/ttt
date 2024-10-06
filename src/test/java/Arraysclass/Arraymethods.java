package Arraysclass;

import java.util.Arrays;

public class Arraymethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3,};
		String string = Arrays.toString(arr);
		System.out.println(arr);


		

        int[] emptyArray = {};
        System.out.println(Arrays.toString(emptyArray));
       
        int[] ar = {3, 1, 4, 2};
        Arrays.sort(ar);
        System.out.println(ar);
        System.out.println(Arrays.toString(ar)); // Output: [1, 2, 3, 4]

        int[] emptyArr = {};
        Arrays.sort(emptyArr);
        System.out.println(Arrays.toString(emptyArr));
        
        int[] ar2 = {5, 2, 4, 1, 3};
        Arrays.sort(ar2, 1, 4); // Sorts from index 1 to 3
        System.out.println(Arrays.toString(ar2)); // Output: [5, 1, 2, 4, 3]
	

	}

}
