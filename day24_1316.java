import java.util.Scanner;

public class day24_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		int cnt=test;
		for(int i=0;i<test;i++) {
			String word=scan.next();
			boolean[] check=new boolean[26];
			for(int j=1;j<word.length();j++) {
				if(word.charAt(j-1)!=word.charAt(j)) {
					if(check[word.charAt(j)-97]==true) {
						cnt--;
						break;
					}
					check[word.charAt(j-1)-97]=true;
				}
			}
		}
		System.out.println(cnt);
			
		
	}

}
