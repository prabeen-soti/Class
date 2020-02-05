
public class ForLoopStatement2 {

	public static void main(String[] args) {
		// Declaring Loop Control variables Inside The For Loop
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
//		System.out.println(i);
		for(int a=1,b=20;a<b;a++,b--) {
			System.out.println(a+","+b);
		}
		int a,b;
		for(a=1,b=20;a<b;a++,b--) {
			System.out.println(a+","+b);
		}
		
		//Infinite Loop In For Statement
		for(;;) {
			System.out.println("Infinite Loop");
		}
	}

}
