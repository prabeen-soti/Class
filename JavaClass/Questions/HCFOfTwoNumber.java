
public class HCFOfTwoNumber {

	public static void main(String[] args) {
		int a = 12 , b = 8;
		int hcf = 1;
		for(int i = 1 ; i<=a && i<=b ; i++) {
			if(a%i == 0 && b%i == 0) {
				hcf = i;
			}
		}
		System.err.println("HCF of "+a+" & "+b+" is "+hcf);
		
	}

}
