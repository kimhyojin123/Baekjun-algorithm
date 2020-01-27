import java.util.Scanner;

public class day17_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		int [] array=new int[26];
		for(int i=0;i<26;i++) {
			array[i]=-1;
		}
		for(int i=0;i<word.length();i++) {
			int temp=word.charAt(i);
			if(array[temp-97]==-1) {
				array[temp-97]=i;
			}
		}
		for(int i=0;i<26;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
