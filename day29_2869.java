import java.util.Scanner;

public class day29_2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int v=scan.nextInt();
		int day=0;
		int m=0;
		while(m<v) {
			day++;
			m+=a;
			if(m>=v) {
				break;
			}
			else {
				m-=b;
			}
		}
		System.out.print(day);
	}

}
// 2 -1   2 -1  2 -1  2 