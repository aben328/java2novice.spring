/**
 * 
 */
package com.java2novice.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Another alternative way of checking the dependencies of a spring bean is by creating a custom annotation of the same
 * style as @Required annotation. This annotation is equivalent to @Required annotation. In case, if you are migrating
 * your code to spring, if you have used few custorm annotations to check dependencies, this approach will be very
 * useful. Here is the @Mandatory custom annotation: - @see more at:
 * http://java2novice.com/spring/custom-required-style-annotation/#sthash.mpTnhNHy.dpuf
 * @author java2novice
 * @date 2015年12月3日下午2:15:52
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Mandatory {

}
