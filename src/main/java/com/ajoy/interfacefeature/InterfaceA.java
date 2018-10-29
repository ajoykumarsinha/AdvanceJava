/**
 * 
 */
package com.ajoy.interfacefeature;

/**
 * @author a602276
 *
 */
public interface InterfaceA {

	public void testMethod();
	
	default void logMethod (String msg) {
		System.out.println(" This is log message "+msg);
	}
	
	static void printMethod (String msg) {
		System.out.println(" This is pring message "+msg);
	}
}
