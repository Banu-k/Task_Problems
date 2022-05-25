// 9. copy one array list into another array list.

package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;



public class Program_09 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Banu");
		arr.add("Rekha");
		arr.add("Bhuna");
		arr.add("Sweety");
		arr.add("Anu");
		
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("***Copy ONE Array List into Another Array List***");
		
		ArrayList<String> arr1 = new ArrayList<String>(arr);
		//arr1 = arr;
		
		Iterator itr1 = arr1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}
}
