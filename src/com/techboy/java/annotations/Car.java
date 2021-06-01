package com.techboy.java.annotations;

public @interface Car {
	String brand() default "";
	String model() default "";
	String plate() default "";
}
