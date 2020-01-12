import java.util.Scanner;

public class day4_threenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		if(a>=1&&a<=100&&b>=1&&b<=100&&c>=1&&c<=100) {
			if(a>=b&&a>=c) {
				if(c>=b) {
					System.out.print(c);
				}
				else {
					System.out.print(b);
				}
			}
			else if(b>=a&&b>=c){
				if(a>=c) {
					System.out.print(a);
				}
				else {
					System.out.print(c);
				}
			}
			else {
				if(a>=b) {
					System.out.print(a);
				}
				else {
					System.out.print(b);
				}
			}
		}
		scan.close();
	}

}
