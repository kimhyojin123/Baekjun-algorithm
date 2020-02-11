import java.util.Scanner;

public class day28_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=1;
		int b=1;
		int i=1;
		while(i<n) {
			n-=i;
			i++;
		}
		if(i%2==1) {
			System.out.print((i+1-n)+"/"+n);			
		}
		else {
			System.out.print(n+"/"+(i+1-n));
		}
	}
}
