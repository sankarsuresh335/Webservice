package com.Yatrademopackage;

public class Demo_IT {
	
	public static void myMethod() {
		
		
			int num=257;
			
			int total=0;
			
			
			while (num>0) {
				
				total=total+num%10;
				System.out.println(num%10);
				num=num/10;
				
			}
			System.out.println(total);
		
			
}
	
	public static void mymethod2() {
		
		int num =0;
		
		int num2=0;
		
		for(int i=0; i<=5 ;i++) {
			
			num2=num2+i;
			
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myMethod();
		
		mymethod2();

	}

}
