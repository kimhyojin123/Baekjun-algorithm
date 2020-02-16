import java.util.Scanner;

public class day31_2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int i=0;i<test;i++) {
			int k=scan.nextInt();
			int n=scan.nextInt();
			int [][]array=new int[k+1][n];
			for(int j=0;j<n;j++) {
				array[0][j]=j+1;
			}
			for(int r=1;r<k+1;r++) {
				array[r][0]=1;
			}
			for(int l=1;l<k+1;l++) {
				for(int m=1;m<n;m++) {
					array[l][m]=array[l][m-1]+array[l-1][m];
				}
			}
			System.out.println(array[k][n-1]);
		}
	}

}

