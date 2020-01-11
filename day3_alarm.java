import java.util.Scanner;

public class day3_alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>=0&&a<=23&&b>=0&&b<=59) {
			if(b>=45) {
				System.out.print(a+" "+(b-45));
			}
			else {
				if(a==0) {
					System.out.print("23 "+((b+60)-45));
				}
				else {
				System.out.print((a-1)+" "+((b+60)-45));
				}
			}
		}
		scan.close();
	}

}
