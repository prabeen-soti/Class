
public class BitwiseAndLogicalOperator {
	//Bitwise and & , inclusive or | , exclusive or ^
	//Logical and && , or ||
	public static void main(String[] agrs) {
		// a b  a&b a|b a^b
		// 0 0   0   0   0
		// 0 1   0   1   1
		// 1 0   0   1   1
		// 1 1   1   1   0
		
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a<b&++a<c);//false &  true = false
		System.out.println(a);
		System.out.println(a<b&&++a<c);//false &  true = false
		System.out.println(a);
		
		System.out.println(a>b|++a<c);//true or  true = true
		System.out.println(a);
		System.out.println(a>b||++a<c);//true or  true = true
		System.out.println(a);
		
	
	}
}
