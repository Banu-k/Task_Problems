// 4. retrieve an element (at a specified index) from a given array list.

package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Program_04 {
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
		
		System.out.println("Which Index Student Details You Want: ");
		int index = sc.nextInt();
		
		for(Program_001 pg: al) {
			if(index == al.indexOf(pg)) {
				System.out.println("Student Name: " +pg.getName() +"\n" +"Student Age: " +pg.getAge() +"\n" +"Student Email: " +pg.getEmail() +"\n" +"Student Gender: " 
						+pg.getGender() +"\n" +"Student Mobile Number: " +pg.getMobileNumber() +"\n" +"Student Registration Number: " +pg.getRegistrationNumber() +"\n");
			}
		}
		
	}
}














