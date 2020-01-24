import java.util.Scanner;

public class day15_15596 {
	public static long sum (int[] a) {
		long total=0;
		for(int i=0;i<a.length;i++) {
			total += a[i];
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		System.out.print(sum(a));
	}

}
