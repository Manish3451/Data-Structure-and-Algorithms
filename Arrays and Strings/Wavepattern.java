package wave_pattern1;

import java.util.Scanner;

public class Wavepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        
        
        	int n = scn.nextInt();
        	int m = scn.nextInt();
        	int [][] arr = new int [n][m];
        	for(int i = 0; i < arr.length; i++) {
        		for(int j = 0; j < arr[0].length; j++) {
        			arr[i][j] = scn.nextInt();
        		}
        	}
        
       waveprintRowwise(arr);
        
	}
	public static void waveprintRowwise(int [][] arr) {
		for(int i = 0; i < arr.length; i++){
			if(i%2==0) {
				for(int j = 0; j <= arr[0].length-1; j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int j = arr[0].length-1; j >= 0; j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
				
		}
		System.out.print("END");
	}

}
