
public class TriangularNumber {

	public static void main(String[] args) {
		
		int N = 15;
		int sum = 0;
		for(int i =1;i<N;i++) {
			sum+=i;
//			if(sum == N);
			if(sum == N) {
				System.out.println(N+ " is triangular Number");
				break;
			}
			if(sum > N) {
				System.out.println(N+" is not a triangular number");
				break;
			}
			
		}

	}

}
