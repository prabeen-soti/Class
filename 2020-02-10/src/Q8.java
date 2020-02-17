
public class Q8 {

	public static void main(String[] args) {
//		int noofcolumns = 1;
//		int startr = 0;
//		int size = 17;
//		int noofspace = size / 2;
//
//		for (int i = 1; i <= size; i++) {
//
//			for (int j = 1; j <= noofspace; j++) {
//				System.out.print(" ");
//			}
//			if (i < size / 2 + 1) {
//				startr = i;
//				noofspace = noofspace - 1;
//			} else {
//
//				startr = (size + 1) - i;
//				noofspace = noofspace + 1;
//			}
//
//			for (int j = 1; j <= noofcolumns; j++) {
//				int middlecolumn = noofcolumns / 2 + 1;
//				System.out.print(startr);
//				if (j < middlecolumn) {
//					startr--;
//				} else {
//					startr++;
//				}
//			}
//			System.out.println();
//			if (i < size / 2 + 1) {
//				noofcolumns = noofcolumns + 2;
//			} else {
//
//				noofcolumns = noofcolumns - 2;
//			}
//		}

		int a[] = { 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= a.length; j++) {
				if (j<=6 && j % ((a.length+1) / 2) <= ((a.length+1) / 2)-i) {
					System.out.print(a[j - 1]);
				} else {
					System.out.print(" ");
				}
				if (j>6 && j % ((a.length+1) / 2) <= i) {
					System.out.print(a[j - 1]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
