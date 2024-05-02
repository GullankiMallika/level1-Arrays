package Javaprogrammes;

import java.util.Arrays;

public class ArraysLevel1 {

	public static void main(String[] args) {
	int[] arr= {6,7,8,9,10};
	
	//Creating Elements in array
	int[] myArray=new int[] {6,7,8,9,10};
	System.out.println("Array Created  With Elements:" +Arrays.toString( myArray));
	
	//AscessTheElement
	
	for(int i=0;i<arr.length;i++) {
	   	 if(i==0) {
	   		System.out.println("The first element is: " + arr[i]);
	   	 }
	   	 if(i==arr.length-1) {
	   		 System.out.println("The fourth element is: " + arr[i]);
	   	 }
	}
	   		 // LoopingthrouganArray
	   		 
	   		for (int i=0; i<arr.length; i++){
				System.out.println("Element at index" +i+ ":" +arr[i]);
	   		}	
				// ModifyinElement
				
				for(int i2=0;i2<arr.length;i2++) {
					if( i2 == 2 ) {
		        		arr[i2] = 10;
		        	}
					}
				 System.out.println(Arrays.toString(arr));
				
				 //Findinind The Length of Array
				 System.out.println(arr.length);	
				 
				 // MultidimentionalArray
				 
				 int[][]arr1= {{1,2},{3,4},{5,6}};
					
					System.out.println("Element at row1 column1:" +arr1[0][1]);
					
					
					//SortingtheNumbers
					int[] arr3= {2,5,6,8,9,7};
					Arrays.sort(arr3);
					for(int i=0;i<arr3.length;i++) {
						System.out.println(arr3[i]);
					}
					//copying Element	
						int[] arr4= {1,2,3,4,5};
						 int[] arr2 =new int[5];
				         for(int i=0;i<arr4.length;i++) {
				        	 arr2[i]=arr4[i];
				        	 
				        	 
				         }
				         System.out.println(Arrays.toString(arr2));
						

					
				 
				 
	   		 

	}
}
	




     



        