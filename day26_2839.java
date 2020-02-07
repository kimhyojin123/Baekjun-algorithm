import java.util.Scanner;

public class day26_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean check=true;
		for(int i=n/5;i>=0;i--) {
			int temp=n;
			temp-=5*i;
			int cnt=i+(temp/3);
			temp-=3*(temp/3);
//			for(int j=i;j>=1;j--) {
//				temp-=5;
//				cnt++;
//			}
//			for(int k=1;k<=temp/3;k++) {  //아랫줄에서 temp가 깍이면서 for문 반복횟수도 같이 변해서 안됨
//				temp-=3;
//				cnt++;
//			}                                
			if(temp==0) {
				System.out.print(cnt);
				check=false;
				break;
			}			
		}
		if(check) {
			System.out.print(-1);
		}
	}

}
