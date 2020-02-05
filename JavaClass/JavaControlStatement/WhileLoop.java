
public class WhileLoop {
	// while(condition){
	//    statement;
	// }
	// it repeated the while block until the condition is true

	public static void main(String[] args) {
		int a = 1+2+3+4+5;
		System.out.println(a);
		// sum up to 100 digit
		int n = 5;
		int sum1 = 0;
		while(n!=0) {
			sum1 += n; // sum = sum + n ;
			--n;
		}
		System.out.println("Sum1 = "+sum1);
		n=1;
		int sum2 = 0;
		while(n<=10) {
			sum2 += n; // sum = sum + n ;
			n++;
			System.out.println(sum2);
		}
		System.out.println("Sum2 = "+sum2);
		char ch = 0;
		int b = 0;
		while(b<200) {
			System.out.println(ch);
			b++;
			ch = (char) b;
		}
	}

}
