import java.util.Scanner;

public class day27_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int cnt=0;
		int sub=1;
		while(n>0) {
			cnt++;
			n-=sub;
			sub=cnt*6;
		}
		System.out.print(cnt);
	}

}
// 1 6(7) 12(19) 18(37) 24(61) 30(91) 36(127) 42(169) 48(217) 54(271) 60(331) 