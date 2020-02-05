
public class IfStatement {
	// if(condition){
	// statement1;
	//  ..
	// }
	// if condition is true then execute statements inside {} block
	// if condition is false then it do not execute statements inside {} block
	// if(condition) 
	// statement1;
	public static void main(String[] args) {
	 int a = 4;
	 if(a%2==0)
		System.out.println(a + " is a even number");
//	 System.out.print(a +" is not a even number");
	 a = 8;
	 if(a%2==0) {
		 System.out.println(a + " is a even number");
		 System.out.println(a + " is exactly divisiable by 2");
	 }
	}
}
