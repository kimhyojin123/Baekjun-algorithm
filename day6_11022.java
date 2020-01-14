import java.util.Scanner;

public class day6_11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [][] array=new int[n][3];
		for(int i=0;i<n;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			array[i][0]=a;
			array[i][1]=b;
			array[i][2]=a+b;
		}
		for(int j=0;j<n;j++) {
			System.out.println("Case #"+(j+1)+": "+array[j][0]+" + "+array[j][1]+" = "+array[j][2]);
		}
		scan.close();
	}

}

