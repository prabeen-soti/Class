
public class NestedClasses {

	public static void main(String[] args) {
//		OuterClass out = new OuterClass();
//		out.display();
//		out.in.display();
		OuterClass.in.display();
		//Here we are using Anonymous Inner class 
		OuterClass out = new OuterClass() {
			@Override
			void displayName() {
				System.out.println("Name 1");
			}
			
			@Override
			void display() {
				System.out.println("Dispaly");
			}
	
		};
		out.displayName();
		out.display();
		
		
		MathDemo math = new MathDemo(5,4);
		System.out.println(math.sum());
		
		
		MathDemo mul = new MathDemo(6,7) {
			@Override
			int sum() {
				return a*b;
			}
		};
		System.out.println(mul.sum());
		
		MathDemo math1 = new MathDemo(9,4);
		System.out.println(math1.sum());

	}

}
