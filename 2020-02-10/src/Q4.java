
public class Q4 {

	public static void main(String[] args) {
		int a[] = { 
				0b0001000100010000010001000, 
				0b0001001010001000100010100, 
				0b1001011111000101000111110,
				0b0110100000100010001000001 };
		int cmp = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 24; j >= 0; j--) {
				if (j > 20) {
					if ((a[i] >> j & cmp) > 0) {
						System.out.print("j");
					} else {
						System.out.print(" ");
					}
				}else if (j > 13) {
					if ((a[i] >> j & cmp) > 0) {
						System.out.print("a");
					} else {
						System.out.print(" ");
					}
				}else if (j > 6) {
					if ((a[i] >> j & cmp) > 0) {
						System.out.print("v");
					} else {
						System.out.print(" ");
					}
				}else {
					if ((a[i] >> j & cmp) > 0) {
						System.out.print("a");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
//		
//		  System.out.println("   J    a   v     v  a ");
//	      System.out.println("   J   a a   v   v  a a");
//	      System.out.println("J  J  aaaaa   V V  aaaaa");
//	      System.out.println(" JJ  a     a   V  a     a");

	}

}
