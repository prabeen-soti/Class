
enum COLOR{
	RED,GREEN,YELLOW
}
enum Direction{
	NORTH(90),EAST(0),WEST(180),SOUTH(270);
	private int angle;
	private Direction(final int angle) {
		this.angle = angle;
	}
	public int getAngle() {
		return this.angle;
	}
}

public class CreateEnums {

	public static void main(String[] args) {
//		System.out.println( COLOR.GREEN);
//		System.out.println( COLOR.YELLOW);
		String color = COLOR.GREEN.toString();
		COLOR color1 = COLOR.RED;
		switch(color1) {
		case RED:
			System.out.println("Color is Red");
			break;
		case GREEN:
			System.out.println("Color is Green");
			break;
		case YELLOW:
			System.out.println("Color is Yellow");
			break;
		default:
			 System.out.println("NO Color Match");
			
		}
		int i =color1.ordinal();
		System.out.println(i);
		
		Direction direction = Direction.EAST;
		if(direction == Direction.EAST) {
		System.out.println(direction);
		System.out.println(direction.ordinal());
		System.out.println(Direction.values());
		System.out.println(Direction.EAST.getAngle());
		}
		
	}

}
