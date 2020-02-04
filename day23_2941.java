import java.util.Scanner;

public class day23_2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		String [] alpha={"c=","c-","d-","lj","nj","s=","z=","dz="};
		int cnt=word.length();
		for(int i=0;i<word.length()-1;i++) {
			for(int j=0;j<7;j++) {
				if(alpha[j].compareTo(word.substring(i, i+2))==0) {
					cnt--;
				}
			}
		}
		for(int i=0;i<word.length()-2;i++) {
			if(alpha[7].compareTo(word.substring(i, i+3))==0) {
				cnt--;
			}
		}
		System.out.println(cnt);
	}

}
