import java.util.Scanner;

public class day33_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int cnt=0;
		for(int i=0;i<n;i++) {
			int a=scan.nextInt();
			boolean check=true;
			for(int j=2;j<a;j++) {
				if(a%j==0) {
					check=false;
				}
			}
			if(a!=1&&check) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
