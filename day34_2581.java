import java.util.Scanner;

public class day34_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int sum=0;
		int min=n;

		for(int i=m;i<=n;i++) {
			boolean check=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					check=false;
				}
			}
			if(check&&i!=1) {
				sum+=i;
				if(i<min) {
					min=i;
				}
			}
		}
		if(sum==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

}
