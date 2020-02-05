
public class BreakGoto {
	// label : {
	//     break label;
	// }

	public static void main(String[] args) {
	 boolean t = true;
	 
	 first : {
		 System.out.println("First");
		  second: {
			 System.out.println("Second");
		      third :{
				 System.out.println("Third");
				 if(t) {
					 break first;
				 }
				   System.out.println("This won't execute");
	           }
			 System.out.println("Second Last");
	       }
		 System.out.println("First Last");
	 }
	 System.out.println("Out of the first label ");

	}

}
