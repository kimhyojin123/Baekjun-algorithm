import java.util.Scanner;
//A:65 Z:90 a:97 z:122
public class day19_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String word= scan.next();
		int []temp=new int[26];
		for(int i=0;i<word.length();i++) {
			for(int j=65;j<91;j++) {
				if(word.charAt(i)==(char)j||word.charAt(i)==(char)(j+32)) {
					temp[j-65]++;
				}
			}
		}
		int max=0;
		char result='?';
		for(int i=0;i<26;i++) {
			if(temp[i]>max) {
				max=temp[i];
				result=(char)(i+65);
			}
			else if(max==temp[i]) {
				result='?';
			}
		}
		System.out.println(result);
	}

}
