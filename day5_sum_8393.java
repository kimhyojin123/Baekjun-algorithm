import java.util.Scanner;

public class day5_sum_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		int sum=0;
		int n=scan.nextInt();
		if(n>=1&&n<=10000) {
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.print(sum);
		}
	}

}
