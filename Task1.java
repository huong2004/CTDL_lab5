package lab5;

import java.util.Arrays;

public class Task1 {
	// add 2 matrices
	public static int[][] add(int[][] a, int[][] b) {
		// TODO
		int result[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}

	// subtract 2 matrices
	public static int[][] subtract(int[][] a, int[][] b) {
		// TODO
		int result[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][j] - b[i][j];

			}
		}
		return result;
	}

	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {
		// TODO
		int result[][] = new int[a.length][a[0].length];
		if (a.length != b[0].length) {
			return null;
		} else {
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					int sum = 0;
					for (int k = 0; k < a.length; k++)
						sum = sum + a[i][k] * b[k][j]; //c11= a11*b11+a12*b12+a13*b13
					result[i][j] = sum;
				}

				
			}
		}
		return result;
	}
	public static int[][] transpose(int[][] a) {
		// TODO
		int result[][] = new int[a[0].length][a.length];
		for (int i=0; i<a[0].length;i++) {
			for (int j=0;j<a.length;j++) {
				result [i][j]=a[j][i];
			}
		}
		return result;
	}
	// print 2D Array
	public static void printArr(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int a[][] = { { 7, 2 }, { 5, 3 } ,{6,3}};
		int b[][] = { { 2, 1 }, { 3, 1 } };
		int add[][] = add(a, b);
		printArr(add);
		int subtract[][] = subtract(a, b);
		printArr(subtract);
		int[][] mul=multiply(a, b);
		printArr(mul);
		int [][] transpose=transpose(a);
		printArr(transpose);
	}
}
