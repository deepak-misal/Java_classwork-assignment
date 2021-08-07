package com.techlab.reflection;

import java.lang.reflect.Method;

import com.techlab.model.Rectangle;

public class ReflectionTest {

	public static void main(String[] args) {
		doReflection(Object.class);
		String string=new String("Deepak");
		Class stringClass=string.getClass();
		doReflection(stringClass);
		Rectangle rect=new Rectangle(10,20);
		Class object=rect.getClass();
		doReflection(object);

	}

	private static void doReflection(Class classobject) {
		ReflectionTest obj = new ReflectionTest();
		  
        Class class1 = obj.getClass();
		System.out.println("The name of class is:"+classobject.getName());
		System.out.println("The public methods of class are : ");   
	    Method[] methods = classobject.getMethods();
	    for (Method method:methods) {
	    	if(ieGetter(method)) {
	    		System.out.println("Getters:"+method.getName());
	    	}else if(isSetter(method)) {
	    		System.out.println("Setters:"+method.getName());
	    	}
	    	
	    }
	    	
	  
		
	}

	private static boolean isSetter(Method m) {
		if(!m.getName().startsWith("set"))
			return false;
		return true;
	}

	private static boolean ieGetter(Method m) {
		if(!m.getName().startsWith("get"))
			return false;
		return true;
	}

}
