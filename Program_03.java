//3. insert an element(Student info) into the array list at the first position.

package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Program_03 {
	public static void main(String[] args) {
		ArrayList<Program_001> al=new ArrayList<Program_001>();
		
		
		Scanner sc = new Scanner(System.in);
		
		//String name = sc.nextLine();
		//sd.setName(name);8
		
		
		System.out.println("How Many Students You Want to ADD: ");
		int std = sc.nextInt();
		for(int i = 0; i<std; i++) {
			Program_001 sd = new Program_001();
			System.out.println("Enter your Name: ");
			sd.setName(sc.next());
			System.out.println("Enter your Age: ");
			sd.setAge(sc.nextInt());
			System.out.println("Enter your Email: ");
			sd.setEmail(sc.next());
			System.out.println("Enter your Gender: ");
			sd.setGender(sc.next());
			System.out.println("Enter your Mobile Number: ");
			sd.setMobileNumber(sc.nextLong());
			System.out.println("Enter your Registration Number: ");
			sd.setRegistrationNumber(sc.nextLong());
			
			al.add(sd);
		}
		System.out.println("you want to add first position in array list ?" +"\n" +"Print 1 means YES or 0 means NO");
		int yesNo = sc.nextInt();
		
		if(yesNo == 1) {
		System.out.println("INSERT FIRST POSITION IN ARRAYLIST");
		System.out.println("----------------------------------");
		Program_001 sd = new Program_001();
		System.out.println("Enter your Name: ");
		sd.setName(sc.next());
		System.out.println("Enter your Age: ");
		sd.setAge(sc.nextInt());
		System.out.println("Enter your Email: ");
		sd.setEmail(sc.next());
		System.out.println("Enter your Gender: ");
		sd.setGender(sc.next());
		System.out.println("Enter your Mobile Number: ");
		sd.setMobileNumber(sc.nextLong());
		System.out.println("Enter your Registration Number: ");
		sd.setRegistrationNumber(sc.nextLong());
		al.add(0,sd);
		}
		else {
			System.out.println("Thankyou...");
		}
		
		Iterator<Program_001> it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println("Student Name: " +((Program_001) obj).getName() +"\n" +"Student Age: " +((Program_001) obj).getAge() +"\n" +"Student Email: " +((Program_001) obj).getEmail() +"\n" +"Student Gender: " 
					+((Program_001) obj).getGender() +"\n" +"Student Mobile Number: " +((Program_001) obj).getMobileNumber() +"\n" +"Student Registration Number: " +((Program_001) obj).getRegistrationNumber() +"\n");
		}
	}
}
