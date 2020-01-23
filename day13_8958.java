import java.util.Scanner;

public class day13_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] sum=new int[n];
		String[] array=new String[n];
		for(int i=0;i<n;i++) {
			array[i]=scan.next();
			sum[i]=0;
			int cnt=0;
			for(int j=0;j<array[i].length();j++) {
				if(array[i].charAt(j)=='O') {
					cnt++;
					sum[i] += cnt;
				}
				else {
					cnt=0;
				}
			}
			}
		for(int i=0;i<n;i++) {
			System.out.println(sum[i]);
		}
		}
}

