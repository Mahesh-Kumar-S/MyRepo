package com.testng.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransform implements IAnnotationTransformer{
	
	//To execute the failed test-cases/test methods for specific iteration at runtime
	
	 public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	 {
		    annotation.setRetryAnalyzer(RetryAnalyzer.class);
		  
	 }

}
