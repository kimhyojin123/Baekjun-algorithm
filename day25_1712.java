import java.util.Scanner;

public class day25_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(c-b<=0) {
			System.out.print(-1);
		}
		else {
			System.out.print(a/(c-b)+1);
		}
	}

}

