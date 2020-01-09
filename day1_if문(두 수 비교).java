import java.util.Scanner;

public class day1_9498{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>=-10000&&a<=10000&&b>=-10000&&b<=10000) {
		if(a>b) {
			System.out.print(">");
		}
		else if(a==b) {
			System.out.print("==");
		}
		else {
			System.out.print("<");
		}
		scan.close();
	    }
	}

}
