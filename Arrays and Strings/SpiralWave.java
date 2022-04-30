package spiral;

import java.util.Scanner;

public class SpiralWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int [][] arr = new int [n][m];
        for(int  i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr[0].length; j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
        spiralwave(arr);
	}
	public static void spiralwave(int [][]arr) {
		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		int total = arr.length*arr[0].length;
		int count = 0;
		while(count<total) {
			for(int i = minr,j=minc; i<=maxr&&count<total; i++) {
				System.out.print(arr[i][j]+", ");
				count++;
			}
			minc++;
			for(int i = maxr,j=minc; j<=maxc&&count<total; j++) {
				System.out.print(arr[i][j]+", ");
				count++;
			}
			maxr--;
			for(int i = maxr,j=maxc; i>=minr && count<total; i--) {
				System.out.print(arr[i][j]+", ");
				count++;
			}
			maxc--;
			for(int i = minr,j=maxc; j>=minc &&count<total; j--) {
				System.out.print(arr[i][j]+", ");
				count++;
			}
			minr++;
		}
		System.out.print("END");
	}

}
