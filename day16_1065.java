import java.util.Scanner;

public class day16_1065 {
	public static int hansu(int n) {
		int cnt=0;
		for(int i=1;i<=n;i++) {
			int size=0;
			int temp=i;
			boolean test=true;
			size=(int)(Math.log10(i)+1);
			if(size>2) {
				int [] array=new int[size];
				for(int j=0;j<size;j++) {
					array[j]=temp%10;
					temp/=10;
				}
				int sub=array[1]-array[0];
				for(int j=2;j<size;j++) {
					if(array[j]-array[j-1]!=sub) {
						test =false;
					}
				}
				if(test) {
					cnt++;
				}
			}
			else {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(hansu(n));
		System.out.print(100%10);
	}

}
