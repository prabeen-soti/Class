
public class StarPattern {
	// *****
	// *****
	// *****
	// *****
	
	//j3210
    //0...#
	//1..##
	//2.###
	//3####
	
	//1
	//12
	//123
	//1234
	//12345

	public static void main(String[] args) {
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i = 0; i<4; i++) {
			for(int j = 3; j>=0; j--) {
				if(i>=j)
				System.out.print('#');
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				if(j<=i)
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

	}

}
