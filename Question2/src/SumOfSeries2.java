import java.util.Scanner;

public class SumOfSeries2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			int var =i*(i+1)*5*i;
			sum+= var; 
//			System.out.println(var);
		}
		System.out.println(sum);

	}

}
