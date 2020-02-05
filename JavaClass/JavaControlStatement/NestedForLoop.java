
public class NestedForLoop {
	
	public static void main(String[] args) {
		for(int i = 0; i<3;i++) {
			System.out.println("First i :"+i);
			for(int j = 3;j>0;j--) {
				System.out.println("Loop i :"+i);
				System.out.println("Loop j :"+j);
			}
			System.out.println("Last i :"+i);
		}
	}

}
