package matrixtranspose;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
	
	public static void MatrixTranspose(int[][] mat,int rows,int cols) 
	{
		int [][] trans = new int[cols][rows];
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{
				trans[i][j] = mat[j][i];
			}
		}
		System.out.println(Arrays.deepToString(trans));	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		int[][] mat = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				 mat[i][j] = scanner.nextInt();
			}
		}
		MatrixTranspose(mat,rows,cols);
		 
	}

}
