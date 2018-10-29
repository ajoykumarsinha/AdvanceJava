/**
 * 
 */
package com.ajoy.interfacefeature;

/**
 * @author a602276
 *
 */
public class ImplementationClass implements InterfaceA, InterfaceB {

	
	
	/* (non-Javadoc)
	 * @see com.ajoy.interfacefeature.InterfaceA#testMethod()
	 */
	@Override
	public void testMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void logMethod(String msg) {
		// TODO Auto-generated method stub
		InterfaceA.super.logMethod(msg);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterfaceA.printMethod("Message for Interface A print Method");

		InterfaceB.printMethod("Message for Interface B print Method");
		
		ImplementationClass ic = new ImplementationClass();
		ic.logMethod("This is override method !!");
	}

}
