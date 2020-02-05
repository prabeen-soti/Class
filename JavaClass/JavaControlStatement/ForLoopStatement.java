
public class ForLoopStatement {
	// for(initialization;condition;iteration){
	//    body
	// }
	// if there is only one statement in body , there is no need to curly braces

	public static void main(String[] args) {
		 int n;
//		 System.out.println(n);
		 for(n=1;n<=10;n++) {
			 System.out.print("value of n : ");
			 System.out.println(n);
		 }
		 System.out.println(n);
		 
		 int i;
		 for(i=0;i<=5;i=i+2) System.out.println("value of i : "); 
		 System.out.println(i);
	}

}
