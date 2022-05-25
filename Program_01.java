//1. create a new array list, add some student details and printout the collection.

package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Program_01 {
	public static void main(String[] args) {
		ArrayList<Program_001> al=new ArrayList<Program_001>();
		
		Scanner sc = new Scanner(System.in);
		
		//String name = sc.nextLine();
		//sd.setName(name);
		
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
		
		for(Program_001 pgm : al) {
		System.out.println("Student Name: " +pgm.getName() +"\n" +"Student Age: " +pgm.getAge() +"\n" +"Student Email: " +pgm.getEmail() +"\n" +"Student Gender: " 
				+pgm.getGender() +"\n" +"Student Mobile Number: " +pgm.getMobileNumber() +"\n" +"Student Registration Number: " +pgm.getRegistrationNumber() +"\n");
		}
	}
}