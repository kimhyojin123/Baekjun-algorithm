import java.util.Scanner;

public class day8_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int n=a;
		int cnt=0;
		while(true) {
			int temp=(a/10)+(a%10);
			int x=(temp%10)+(a%10)*10;
			cnt++;
			if(n==x) {
				break;
			}
			a=x;
		}
		System.out.print(cnt);
		scan.close();
	}

}
