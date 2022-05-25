// 8. sort a student list based on their name in ASC.
// ascending order sort==> Collections.sort(ArrayList_Name);
// descending order sort==> Collections.sort(ArrayList_Name, Collections.reverseOrder());


package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program_08 {
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
		
		System.out.println("*** Before Sorting ***");  
		
		Iterator<Program_001> it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println("Student Name: " +((Program_001) obj).getName() +"\n" +"Student Age: " +((Program_001) obj).getAge() +"\n" +"Student Email: " +((Program_001) obj).getEmail() +"\n" +"Student Gender: " 
					+((Program_001) obj).getGender() +"\n" +"Student Mobile Number: " +((Program_001) obj).getMobileNumber() +"\n" +"Student Registration Number: " +((Program_001) obj).getRegistrationNumber() +"\n");
		}
		
		System.out.println("*** After Sorting ***");  
		
		Comparator<Program_001> compare = Comparator.comparing(Program_001::getName);  
		   Collections.sort(al,compare);  
		   
		   for(Program_001 st: al){  
		     System.out.println("Student Name: " +st.getName() +"\n" +"Student Age: " +st.getAge() +"\n" +"Student Email: " +st.getEmail() +"\n" +"Student Gender: " 
						+st.getGender() +"\n" +"Student Mobile Number: " +st.getMobileNumber() +"\n" +"Student Registration Number: " +st.getRegistrationNumber() +"\n");  
		     }  
		
	}
}
