import java.util.Scanner;

public class Q7 {
	
	static boolean checkNumber(int a,int b) {
		int a2[] = {a%10,a/10};
		int b2[] = {b%10,b/10};
		for(int i=0;i<a2.length;i++) {
			
			for(int j=0;j<b2.length;j++) {
				
				if(a2[i]==b2[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int a,b;
		Scanner scn = new Scanner(System.in);
		do {
			a = scn.nextInt();
			b = scn.nextInt();
		} while(a<25 || a>75 && b<25 || b>75);
		
		System.out.println(checkNumber(a, b));
	}

}
