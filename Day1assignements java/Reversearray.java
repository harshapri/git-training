package com.sonata;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]intarray={1,2,3,4,5,6,7};
		System.out.println("original array:");
		for(int i=0;i<intarray.length;i++)
			System.out.println(intarray[i]+" ");
		System.out.println();
		System.out.println("Reverse array:");
		for(int i=intarray.length-1;i>=0;i--)
			System.out.println(intarray[i]+" ");

	}

}
