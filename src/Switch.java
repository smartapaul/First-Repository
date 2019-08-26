
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=72;
		
		switch (y) {
		case 70:
		case 72:
		case 75:
			System.out.print("High");
			break;
		case 50:
			System.out.print("Medium");
			break;
		case 30:
			System.out.print("Low");
		default:
			System.out.print("This does not exist in our system");
			break;
		}

	}

}
