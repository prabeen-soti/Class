
public class Q82 {

	public static void main(String[] args) {
		
		int a = 4;
		for(int i=1;i<=a;i++) {
			for(int j=a;j>=1;j--) {
				if(j<=i) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			
			for(int j = 2;j<=a;j++) {
				if(j<=i) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=a-1;i>=1;i--) {
			for(int j=a;j>=1;j--) {
				if(j<=i) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			
			for(int j = 2;j<=a;j++) {
				if(j<=i) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
