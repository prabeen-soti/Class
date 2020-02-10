import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=N;i++) {
			int var = 1;
			for(int j=1 ;j<i;j++) {
				var=var*10+1;
			}
//			System.out.println(i+" Var: "+ var);
			sum+=var;
		}
		System.out.println("Sum : "+sum);
	}

}
