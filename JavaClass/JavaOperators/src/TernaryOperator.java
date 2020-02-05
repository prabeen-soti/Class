
public class TernaryOperator {
	// ?: ternary operator
	//  condition?return if condition true : return if condition false;
	public static void main(String [] args) {
		int a = 3;
		int b = 2;
		int min = a<b?a:b;
		int max = a>b?a:b;
		System.out.println("Minimum value is "+min);
		System.out.println("Maximum value is "+max);
	}

}
