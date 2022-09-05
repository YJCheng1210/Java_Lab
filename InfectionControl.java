import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InfectionControl {

	public static void main(String[] args) {
		System.out.println("Enter Number of Citizens: ");
		Scanner scanner = new Scanner(System.in);
		int citizenNum = scanner.nextInt();
		
		ArrayList<Integer> citizenID = new ArrayList<Integer>();
				
		for (int i=0; i<citizenNum; i++)
			citizenID.add(i);
		
		ArrayList<Integer> contactee =  new ArrayList<Integer>();
		contactee.addAll(citizenID);
		Collections.shuffle(contactee);
		
		System.out.println("ID\t\t" + citizenID);
		System.out.println("contactee\t" + contactee);
		
		System.out.println("Enter an infected citizen: ");
		Integer first = scanner.nextInt();
		
		ArrayList<Integer> infected = new ArrayList<Integer>();
		infected.add(first);
		
		Integer next = contactee.get(citizenID.indexOf(first));
		
		boolean id_side = true;
		
		while (next != first) {
			infected.add(next);
			if (id_side) {
				next = contactee.get(citizenID.indexOf(next));
				id_side = true;
			} else {
				next = citizenID.get(contactee.indexOf(next));
				id_side= false;
			}
		}
		
		System.out.println(infected);
		
		scanner.close();
	}
}
