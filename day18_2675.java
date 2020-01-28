import java.util.Scanner;

public class day18_2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int i=0;i<test;i++) {
			int repeat=scan.nextInt();
			String str=scan.next();
			for(int j=0;j<str.length();j++) {
				for(int k=0;k<repeat;k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
