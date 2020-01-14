import java.util.Scanner;

public class day6_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] array=new int[n];
		for(int i=0;i<n;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			array[i]=a+b;
		}
		for(int j=0;j<n;j++) {
			System.out.println("Case #"+(j+1)+": "+array[j]);
		}
		scan.close();
	}

}
