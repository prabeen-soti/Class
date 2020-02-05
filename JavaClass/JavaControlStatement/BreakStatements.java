
public class BreakStatements {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Break Called");
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				System.out.print("Continue Called");
				continue;// it transfer the PC to the top of the block
			}
			System.out.println(i);
		}
		for(int i=0;i<10;i++) {
			if(i==5) {
				System.out.print("Return Called");
				return;// it transfer the PC to the method caller
			}
			System.out.println(i);
		}
		System.out.println("Return");
	}
}
