package Patterns;

import java.util.function.Consumer;

public class pattern1 {
	
	public  static void SquareHollow(int n) {
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
				System.out.print("* ");}
			
			else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
	}
	
	public static void Numbertriangle(int n) {
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-(i+1);s++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i+1;j++) {
				System.out.print(i+1 + " ");
			}
			System.out.println();
		}
	}
	
	public static void NumberIncreasingPyramid(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(j+1 +" ");
			}
			System.out.println();
		}
		
	}
	
	public static void NumberIncreasingReversePyramid(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0; j<n-i;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
	
	public static void NumberChangingPyramidPattern(int n){
		int count =1;
		for(int i=0;i<n;i++) {
			for(int j=0; j<i+1; j++) {
				if(count<10) {
				System.out.print("0"+count+++ " ");
			}
				else
					System.out.print(count+++ " ");
			
		}
			System.out.println();
	}
	}
	
	public static void ZeroOneTrianglePattern(int n){
		int count =1;
		for(int i=0;i<n;i++) {
			for(int j=0; j<i+1; j++) {
				if(count%2==1) {
				System.out.print("1 ");
			}
				else
					System.out.print("0 ");
	
			count++;
		}
			System.out.println();
	}
	}
	
	public static void p(int n){
	
		for(int i=0;i<n;i++) {
			int count =i+1 ;
			for(int s=0; s<n-i-1; s++) {
				System.out.print("  ");
		}
			for(int j=0; j<i+1; j++) {
				System.out.print(count +" ");
				count--;
		}
			
			
			for(int j=0; j<i; j++) {
				count=j+2;
				System.out.print(count+ " ");
				count++;
		}
			System.out.println();
	}
	}
	
	public static void RhombusPattern(int n) {
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-i-1;s++) {
				System.out.print("  ");
			}
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern(int n,Consumer<Integer> c) {
		c.accept(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*pattern(5, pattern1::SquareHollow);
pattern(7, pattern1::Numbertriangle);
pattern(6, pattern1::NumberIncreasingPyramid);
pattern(5, pattern1::NumberIncreasingReversePyramid);
pattern(5,pattern1::NumberChangingPyramidPattern);
pattern(5,pattern1::ZeroOneTrianglePattern);
pattern(6, pattern1::RhombusPattern); */
		pattern(6, pattern1::p);
	}

	
}
