package test;

public class Frac {
	int a;
	int b;
	//q2a
	private Frac(int numerator,int denominator) {
		int num = numerator/denominator;
		System.out.print(num);
	}
	//q2b
	private Frac(float num) {
		num = Math.round(num);
		System.out.print(num);
	}
	
	//q2c
	static void FracMembrt(int numerator,int denominator) {
		float num = numerator/denominator;
		System.out.print(num);
	}
	
	//q2d
		static void BasicArithmetic(int numerator,int denominator) {
			int add = numerator + denominator;
			int divide = numerator/denominator;
			int multiply = numerator*denominator;
			int sub = numerator-denominator;
			System.out.print(add);
			System.out.print(divide);
			System.out.print(multiply);
			System.out.print(sub);
			
			
		}
	
	
}
