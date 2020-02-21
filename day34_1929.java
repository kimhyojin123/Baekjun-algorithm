import java.util.Scanner;
import java.util.ArrayList;

public class day34_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		for(int i=m;i<=n;i++) {
			boolean check=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					check=false;
				}
			}
			if(check&&i!=1) {
				list.add(i);
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
