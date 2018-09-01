package com.techlabs.annotationtest;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE)  

@interface refractormethod{
	int value() default 10;
}


