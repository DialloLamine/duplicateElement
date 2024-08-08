/**
 * 
 */
package duplicateNumber.findIt;

import java.util.HashSet;
import java.util.Set;

/**
 * Diallo
 * 
 */
public class FindDuplicateElementFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//int array[] = {1, 2, 3, 4, 2, 3, 7, 1};
		
		int array[] = {1, 2, 3, 4, 2, 3, 7, 1, 2, 2};
		
		int count = 0;
		
		Set<Integer> duplicateElement = new HashSet<Integer>();
		
		for(int i = 0; i <array.length; i++) {
			int elementThisPosition = array[i];
			
			count = 0;
			for(int j = 0; j <array.length; j++) {
				if(elementThisPosition == array[j]) {
					count++;
				}	
			}
			if(count > 1) {
				duplicateElement.add(elementThisPosition);
			}
		}
		System.out.println("Voici  les element qui ont des doublons. " + duplicateElement.toString());
	}

}
