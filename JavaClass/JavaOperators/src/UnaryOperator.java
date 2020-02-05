
public class UnaryOperator {

	public static void main(String[] args) {
		int a=3;
		
		//Postfix operator
		System.out.println("Post");
		System.out.println(a++);//a=a+1
		System.out.println(a);
		System.out.println(a--);//a=a-1
		System.out.println(a);
		//Prefix operator
		System.out.println("Pre");
		System.out.println(++a);//a=a+1
		System.out.println(a);
		System.out.println(--a);//a=a-1
		System.out.println(a+"\n");
		
		int b = a++; // b = a; a = a+1;
		System.out.println(a);
		System.out.println(b);
		int c = ++a;// a = a+1; c = a; 
		System.out.println(a);
		System.out.println(c);
		 boolean isTrue = false; // !isTrue;
		 boolean isFalse = !isTrue;
		 if(!isTrue) {
			System.out.println(isFalse); 
		 }

	}

}
