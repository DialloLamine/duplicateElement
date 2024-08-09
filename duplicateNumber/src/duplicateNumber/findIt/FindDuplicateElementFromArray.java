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
		
		
		/*
		 * une methodedefairevec  lamethode contains
		 */
		Set<Integer> temporaryElement = new HashSet<Integer>();
		
		Set<Integer> duplicateElement = new HashSet<Integer>();
		
		for(int i = 0; i <array.length; i++) {
			
				if(!temporaryElement.contains(array[i])) {
					temporaryElement.add(array[i]);
				}
				/*
				 * else duplicateElement.add(array[i]);
				 */
		}
		/*
		 * System.out.println("Voici  les element qui ont des doublons. " +
		 * duplicateElement.toString());
		 */
		
		System.out.println("Voici  les element qui ont des doublons. " + temporaryElement.toString());
		
	}

}
