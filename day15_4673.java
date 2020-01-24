
public class day15_4673 {
	public static int self(int n) {
		int result=n;
		while(n>0) {
			result +=n%10;
			n /=10;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] selfNumber=new boolean[10001];
		for(int i=1;i<=10000;++i) {
			int result=self(i);
			if(result<=10000) {
				selfNumber[result]=true;
			}
		}
		for(int i=1;i<selfNumber.length;++i) {
			if(!selfNumber[i] ) {
				System.out.println(i);
			}
		}
	}
}
