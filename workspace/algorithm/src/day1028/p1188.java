package day1028;

import java.util.*;
public class p1188 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int cnt = 0;
		double temp = (double) n / (double)m;
		System.out.println(temp);
		double temp2 = temp;
		while(temp2 <= 1){
			cnt++;
			temp2 = temp2 + temp;
		}
		
		cnt = cnt-1;
		
		int result = cnt * n ;
		
		System.out.print(result);
		sc.close();
	}
}
