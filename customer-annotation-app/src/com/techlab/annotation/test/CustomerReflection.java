package com.techlab.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.techlab.annotation.Customer;
import com.techlab.annotation.NeedToBeRefactor;

public class CustomerReflection {

	public static void main(String[] args) {
		doReflection(Customer.class);

	}

	private static void doReflection(Class<?> class1) {
		Method[] methods = class1.getMethods();
		Customer customer=new Customer();
		for(Method method:methods) {
			NeedToBeRefactor needrefactor=method.getAnnotation(NeedToBeRefactor.class);
			if(needrefactor!=null)
				try {
					method.invoke(customer);
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		}
		
	}


