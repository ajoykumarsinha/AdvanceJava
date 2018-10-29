/**
 * 
 */
package com.ajoy.featureforeach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author a602276
 *
 */
public class FeatureForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
		List<Integer> objArrayList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			objArrayList.add(i);
		}
		
		// This is For Each Imp
		objArrayList.forEach(new Consumer<Integer>() {
			
			@Override
			public void accept(Integer objInt) {
				
				System.out.println(" Integer Value is >> "+objInt.intValue());
			}

			 
		});
		
		// lambda implementation
		objArrayList.forEach(val -> System.out.println(" Value is >> "+val));
		 

	}

}
