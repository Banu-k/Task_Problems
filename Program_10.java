// 10. shuffle student info in a array list.

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program_10 {
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
		
		
		Collections.shuffle(arr);
		
		itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}