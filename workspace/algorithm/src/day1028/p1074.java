package day1028;

import java.util.*;

public class p1074 {
	static double result = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double r = zzz(Math.pow(2,n),a,b);
		
		System.out.println(r);
		sc.close();
	}
	
	public static double zzz(double n, double a, double b){
		if(n==2){
			result = result + 2*a + b;
		}
		else{
			if(a<n/2 && b<n/2){
				zzz(n/2,a,b);
			}
			else if(a<n/2 && b>=n/2){
				result = result + (n/2)*(n/2);
				zzz(n/2, a % (n/2), b);
			}
			else if(a>=(n/2) && b<=(n/2)){
				result = result + 2*(n/2)*(n/2);
				zzz(n/2, a, b %(n/2));
			}
			else{
				result = result + 3*(n/2)*(n/2);
				zzz(n/2, a%(n/2), b%(n/2));
			}
		}
		
		return result;
	}
	

}
