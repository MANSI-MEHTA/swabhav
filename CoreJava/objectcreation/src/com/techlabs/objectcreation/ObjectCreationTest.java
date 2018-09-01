package com.techlabs.objectcreation;

public class ObjectCreationTest {
	public static void main(String args[]) throws Exception  {
		System.out.println("object creation by new operator");
		ObjectCreation ocnew = new ObjectCreation();

		System.out.println("object creation by forname");
		ObjectCreation oc4name = (ObjectCreation) Class.forName("ObjectCreation").newInstance();
		System.out.println("object creation by new instance");
		ObjectCreation oc = ObjectCreation.class.newInstance();
		
		System.out.println();
		System.out.println("");

	}

}
