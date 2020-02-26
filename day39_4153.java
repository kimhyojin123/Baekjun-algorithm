import java.util.Scanner;

public class day39_4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			boolean check=true;
			if(a==0&&b==0&&c==0) break;
			if(a>b&&a>c) {
				if(a*a!=b*b+c*c) check=false;
			}
			else if(a<b&&b>c) {
				if(b*b!=a*a+c*c) check=false;
			}
			else if(c>b&&a<c) {
				if(c*c!=b*b+a*a) check=false;
			}
			if(check) System.out.println("right");
			else System.out.println("wrong");
		}
	}

}
