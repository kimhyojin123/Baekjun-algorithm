import java.util.Scanner;

public class day32_1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int i=0;i<test;i++) {
			int x=scan.nextInt();
			int y=scan.nextInt();
			int cnt=2;
			int distance=y-x;
			while(distance>cnt) {
				distance-=cnt;
				cnt+=2;
			}
			if(cnt/2>=distance) {
				System.out.println(cnt-1);
			}
			else {
				System.out.println(cnt);
			}
		}
	}
}
// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
// 1 2 3 3 4 4 5 5 5 6  6  6  7  7  7  7  8  8  8  8 
 
// 1-1            1
// 2-11           2
// 3-111          3
// 4-121          3
// 5-1211         4
// 6-1221         4 
// 7-12211        5
// 8-12221        5
// 9-12321        5   
// 10-123211      6
// 11-123221      6
// 12-123321      6
// 13-1233211     7
// 14-1233221     7
// 15-1233321     7
// 16-1234321     7
// 17-8 18-8 19-8 20-8 21-9 22-9 23-9 24-9