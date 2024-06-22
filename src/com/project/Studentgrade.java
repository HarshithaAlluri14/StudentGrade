package com.project;

import java.util.Scanner;

public class Studentgrade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many subjects : ");
		int n = sc.nextInt();
		
		int[] marks = new int[n];
		System.out.println("Enter marks out of 100 : ");
		for(int i=0;i<n;i++) {	
			marks[i] = sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=marks[i];
		}
		
		System.out.println("Total marks obtained : "+sum);
		
		int avg = sum/n;
		
		System.out.println("Average percentage : "+avg);
		
		if(avg>=91 && avg<=100) {
			System.out.println("Grade obtained : A");
		}else if(avg>=82 && avg<=90) {
			System.out.println("Grade obtained : B");
		}else if(avg>=73 && avg<=81) {
			System.out.println("Grade obtained : C");
		}else if(avg>=64 && avg<=72) {
			System.out.println("Grade obtained : D");
		}else if(avg>=55 && avg<=63) {
			System.out.println("Grade obtained : E");
		}else {
			System.out.println("Grade obtained : F");
		}
		
	}

}
