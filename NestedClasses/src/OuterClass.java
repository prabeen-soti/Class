
public class OuterClass {
	
	static class InnerClass{
		
		static void display() {
			System.out.println("Static Inner Class");
		}
		
	}
	static InnerClass in = new InnerClass();
	
//	class InnerClass{
//		
//		void display() {
//			System.out.println("Non Static Inner Class");
//		}
//		
//	}
//	InnerClass in = new InnerClass();
//	void display() {
//		in.display();
//	}
	
	void display() {
		class InnerClass1{
			void display1() {
				System.out.println("Mehod Local Inner Class");
			}
		}
	}
	
	void displayName() {
		System.out.println("Name");
	}

}
