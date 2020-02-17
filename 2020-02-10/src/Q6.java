
public class Q6 {
	//Write a method of a class with three arguments to calculate the sum of two integers and 
	//return true if the sum is equal to a third integer
	static boolean isSumEqual(int a, int b, int c) {
		if(c==(a+b)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isSumEqual(12, 3, 43));
		System.out.println(isSumEqual(2, 2, 4));
	}
	

}
