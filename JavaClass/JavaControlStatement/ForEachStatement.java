
public class ForEachStatement {

	// for(type itr-var:collection){
	//   body
	// }
	public static void main(String[] args) {
		int n [] = {2,3,4,5,8,9,10,12};
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		// for each of collection
		for(int a:n) {
			System.out.println(a);
		}
		
	}

}
