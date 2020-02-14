import java.util.Scanner;

public class day30_10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int i=0;i<test;i++) {
			int h=scan.nextInt();
			int w=scan.nextInt();
			int n=scan.nextInt();
			if((n/h+1)<10) {
				System.out.print((n%h)*10);
				System.out.println(n/h+1);
			}
			else {
				System.out.print(n%h);
				System.out.println(n/h+1);
			}
		}
	}
}
