package j01_j02_Homework.Arrays_Homework;

import java.util.Arrays;

public class Task03 {
	
	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

		int arr[]={2, 45, 67, 89};
		int[] yeniArr=new int[arr.length];
		for(int i=0;  i<arr.length; i++) {
			if (i == arr.length - 1) {
				yeniArr[0] = arr[i];
			}
				else {
					yeniArr[i+1]=arr[i];
				}
			}

		System.out.println(Arrays.toString(yeniArr));
	}


	}


