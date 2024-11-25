package com.test01;

import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		String str = "APPLET";
		
		int cnt=0;
		
		int sum=0;
		
		for(int i=0;i<5;i++) {
			char c = sc.next().charAt(0);
			if(str.charAt(i)==c) {
				cnt++;
				sum+= cnt;
			}
			
		}
		
		System.out.println(cnt+"개 맞추었습니다");
	}
	

}
