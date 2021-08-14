import java.util.*;
public class Season_by_months {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month number :");
		int a = s.nextInt();
		
		switch (a)
		{
		case 3:
		case 4:
		case 5:
			System.out.println("SUMMER");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("RAINY");
			break;
		case 10:
		case 11:
		case 12:
		case 1:
		case 2:
			System.out.println("WINTER");
			break;
			default :
				System.out.println("Enter a valid month number :");
				break;
		}

	}

}