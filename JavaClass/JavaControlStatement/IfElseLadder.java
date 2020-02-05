
public class IfElseLadder {
	   // if(condition1){
		// ifstatement1;
		//  ..
		// } else if (condition2){
		// elseifstatement1;
		// ...
		// }else{
		// ....
		// }
	public static void main(String[] args) {
		 int month = 1;//April
		 int n = 0;
		 String season;
		 if(month==12 || month==1 || month==2) {
			 n++;
			 season = "Winter";
		 } else if(month==3 || month==4 || month==5) {
			 n++;
			 season =  "Spring";
		 }else if(month==6 || month==7 || month==8) {
			 n++;
			 season = "Summer";
		 } else if(month==9 || month==10 || month==11) {
			 n++;
			 season = "Autumn";
		 } else {
			 n++;
			 season = "Supplied number is not a month";
		 }
		 
		 
		 System.out.println(n);
		 System.out.println(season);

	}

}
