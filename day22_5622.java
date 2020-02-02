import java.util.Scanner;

public class day22_5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		int time=0;
		for(int i=0;i<word.length();i++) {
			for(int j=0;j<5;j++) {
				if((int)word.charAt(i)<=(3*j+67)&&(int)word.charAt(i)>=(3*j+65)) {
					time+=j+3;
				}
			}
			if((int)word.charAt(i)<=83&&(int)word.charAt(i)>=80) {
				time+=10;
			}
			if((int)word.charAt(i)<=86&&(int)word.charAt(i)>=84) {
				time+=11;
			}
			if((int)word.charAt(i)<=90&&(int)word.charAt(i)>=87) {
				time+=12;
			}
		}
		System.out.println(time);
	}
}