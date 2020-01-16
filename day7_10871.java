package baekjun;

import java.util.Scanner;

public class day7_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
	    int [] array=new int[a];
		int x=scan.nextInt();
		for(int i=0;i<a;i++) {
			array[i]=scan.nextInt();
		}
		for(int j=0;j<a;j++) {
			if(array[j]<x) {
				System.out.print(array[j]+" ");
			}
		}
		scan.close();
	}

}
