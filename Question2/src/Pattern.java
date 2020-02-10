
public class Pattern {
	public static void main(String[]args) {
//		String name ="Programming";
		String name = new String("Programming");
		for(int i = 0;i<name.length();i++) {
			for(int j = 0;j<name.length()-i;j++){
				System.out.print(name.charAt(j));
			}
			System.out.println();
		}
		
		char[] nameChar = {'P','r','o','g','r','a','m','m','i','n','g'};
		for(int i = 0;i<nameChar.length;i++) {
			for(int j = 0;j<nameChar.length-i;j++){
				System.out.print(nameChar[j]);
			}
			System.out.println();
		}
	}

}
