
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOption = sc.nextLine().toLowerCase().trim();
		
		switch(processOption) {
			case "order":
				System.out.println("Please provide the phone model name!!");
				Orders poc = new Orders();
				String phoneModelName = sc.nextLine();
				poc.processOrder(phoneModelName);
	
				break;
			case "phonerepair":
				System.out.println("Please provide the Phone model name you want to repair!!");
				String phoneRepairModelName = sc.nextLine();
				PhoneRepairs prc = new PhoneRepairs();
				prc.processPhoneRepair(phoneRepairModelName);
				
				break;
				
			case "accessoryrepair":
				System.out.println("Please provide the Accessory name you want to repair!!");
				String accessoryRepairModelName = sc.nextLine();
				AccessoryRepairs arc = new AccessoryRepairs();
			    arc.processAccessoryRepair(accessoryRepairModelName);
				
				break;
				
			default:
				System.out.println("Enter a valid option !!!!!");
				break;
		}
		sc.close();
	}
}