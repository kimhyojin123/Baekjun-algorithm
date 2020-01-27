import java.util.Scanner;

public class day_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s=scan.next();
		int sum=0;
		for(int i=0;i<n;i++) {
			char c=s.charAt(i);
			sum+=(int)c-48;
		}
		System.out.print(sum);
	}

}
