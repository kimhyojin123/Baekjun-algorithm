import java.util.Scanner;

public class day20_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);		
		String str=scan.nextLine();
		int cnt=0;
		if(str.isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(str.split(" ").length);
		}
	}

}
