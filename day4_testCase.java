import java.util.Scanner;

public class day4_testCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int [] array=new int[t];
		for(int i=0;i<t;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(a>0&&a<10&&b>0&&b<10) {
				array[i]=a+b;
			}
			
		}
		for(int j=0;j<t;j++) {
			System.out.println(array[j]);
		}
		scan.close();
	}

}
