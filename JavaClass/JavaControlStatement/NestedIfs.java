
public class NestedIfs {

	// if we use if or if else or if else ladder in side if or else blocks then it called nestedIfs
	// if(condition1){
	//    if(condition2){
	//     statement;
	//     }
	// }
	//
	public static void main(String[] args) {
		int n = 10;
		if(n%2==0) {
			System.out.println(n + " is divisable by 2");
			if(n%5==0) {
				System.out.println(n + " is also divisable by 5");
			}else {
				System.out.println(n + " is not divisable by 5");
			}
			
		}else {
			System.out.println(n + "is not divisable by 2");
		}
		System.out.println("....................................");
		n = 12;
		if(n%2==0) {
			int a = n/2;
			System.out.println(n + " is divisable by 2");
			n = 5;
			if(n%5==0) {
				System.out.println(n + " is also divisable by 5");
			}else {
				System.out.println(n + " is not divisable by 5");
			}
			
		}else {
			System.out.println(n + " is not divisable by 2");
		}
		

	}

}
