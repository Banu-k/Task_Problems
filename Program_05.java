// 5. update specific student details by given Roll No.

package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Program_05 {
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
		
		Iterator<Program_001> it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println("Student Name: " +((Program_001) obj).getName() +"\n" +"Student Age: " +((Program_001) obj).getAge() +"\n" +"Student Email: " +((Program_001) obj).getEmail() +"\n" +"Student Gender: " 
					+((Program_001) obj).getGender() +"\n" +"Student Mobile Number: " +((Program_001) obj).getMobileNumber() +"\n" +"Student Registration Number: " +((Program_001) obj).getRegistrationNumber() +"\n");
		}
		
		System.out.println("Enter the Register Number for Which Student Details You Want to UPDATE: ");
		int regNum = sc.nextInt();
		int index = 0;
		for(int i = 0; i<al.size(); i++) {
			if(al.get(i).getRegistrationNumber() == regNum) {
				index = i;
				System.out.println("Enter your New Name: ");
				String newName = sc.next();
				al.get(index).setName(newName);
				System.out.println("Enter your New Age: ");
				String newAge = sc.next();
				al.get(index).setName(newAge);
				System.out.println("Enter your New Email: ");
				String newEmail = sc.next();
				al.get(index).setName(newEmail);
				System.out.println("Enter your New Gender: ");
				String newGender = sc.next();
				al.get(index).setName(newGender);
				System.out.println("Enter your New Mobile Number: ");
				String newMobileNumber = sc.next();
				al.get(index).setName(newMobileNumber);
				
			}
			else {
				System.out.println("The Given Registration Number is WRONG...");
			}
		}
		
		for(Program_001 pg: al) {
			if(index == al.indexOf(pg)) {
				System.out.println("Student Name: " +pg.getName() +"\n" +"Student Age: " +pg.getAge() +"\n" +"Student Email: " +pg.getEmail() +"\n" +"Student Gender: " 
						+pg.getGender() +"\n" +"Student Mobile Number: " +pg.getMobileNumber() +"\n" +"Student Registration Number: " +pg.getRegistrationNumber() +"\n");
			}
		}
		
	}
}
