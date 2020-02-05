
public class DoWhileLoop {
	// do {
	//    statement;
	// }while(condition);
	// it run block first time with out checking condition
	// it repeated the while block until the condition is true
	public static void main(String[] args) {
		int n = 0;
		int sum1 = 0;
		do{
			System.out.println("top"+n);
			sum1 += n; // sum = sum + n ;
			--n;
			System.out.println("Sum ="+ sum1);
			System.out.println("bottom"+n);
		}while(n>0);
		
	}

}
