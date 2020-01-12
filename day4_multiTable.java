import java.util.Scanner;

public class day4_multiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a>=1&&a<=9) {
		for(int i=1;i<=9;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
		}
		scan.close();
	}

}
