import java.io.*;
import java.util.*;

public class Patterns {
	static void pattern(int n) {
		/*
			*****
			*****
			*****
			*****
			*****
		 */
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern1(int n) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for (int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern2(int n) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void pattern3(int n) {
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		for (int i = 0; i < n; i++) {
			for(int j = n-1; j >=i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern4(int n) {
		/*
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 */
		for (int i = 0; i < n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void pattern5(int n) {
		for (int i = n; i >= 1; i--) {
			/*
			 *     *    
			 *    ***   
			 *   *****  
			 *  ******* 
			 * *********
			 */
			//Spaces
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			//Stars
			for (int j = i; j <= 2*n-i; j++) {
				System.out.print("*");
			}
			//Spaces
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void pattern6(int n) {
		for (int i = 1; i <= n; i++) {
			/*
			* *********
			*  ******* 
			*   *****  
			*    ***   
			*     *    
			 */
			//Spaces
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			//Stars
			for (int j = i; j <= 2*n-i; j++) {
				System.out.print("*");
			}
			//Spaces
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void pattern7(int n) {
		/*
		*    
	   ***   
	  *****  
	 ******* 
	*********
	*********
	 ******* 
	  *****  
	   ***   
	    *    
		*/
		for (int i = n; i >= 1; i--) {
			/*
			 *     *    
			 *    ***   
			 *   *****  
			 *  ******* 
			 * *********
			 */
			//Spaces
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			//Stars
			for (int j = i; j <= 2*n-i; j++) {
				System.out.print("*");
			}
			//Spaces
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			/*
			* *********
			*  ******* 
			*   *****  
			*    ***   
			*     *    
			 */
			//Spaces
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			//Stars
			for (int j = i; j <= 2*n-i; j++) {
				System.out.print("*");
			}
			//Spaces
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void pattern8(int n){

		/*  ****  ****  ****  ****
		 *  ****  ****  ****  ****
		 *  ****  ****  ****  ****
		 *  ****  ****  ****  ****
		 */
		
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					System.out.print("*");
				}
				for(int j1= 0; j1 < n-(n/2); j1++){
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	 static void pattern9(int n){
	 	/* 1
	 	 * 1 2
	 	 * 1   3
	 	 * 1     4
	 	 * 1 2 3 4 5
	 	 */

		 for(int i = 1; i<= n; i++){
			 for (int j = 1; j <= i; j++){
				 if (j == 1 || j == i || i == n) System.out.print(" "+j);
				 else System.out.print(" ");
			 }
			 System.out.println();
		 }

	 }

	static void pattern10(int n){
		/* 10101010
		*  01010101
		*  10101010
		*  01010101
		*  10101010
		* */
		int c = 1;
		for (int i = 0; i <= n; i++){
			for (int j = 0; j <= n; j++){
				if(i%2==0) System.out.print(1+" ");
				else System.out.print(0+" ");
				c++;
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			pattern10(n);
		}
		sc.close();
//		IO.println("Happy Java 25");
//		 System.out.println("Patterns");
		
	}
}