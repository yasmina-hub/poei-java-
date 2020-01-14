package org.eclipse.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@EnableAspectJAutoProxy
//@Component
//@Aspect
public class TestAspect {
//	@Before("execution(public void org.eclipse.nation.French.saluer(..))")
	
//	@Before("execution(public * org.eclipse.nation.French.saluer(..))")
//	public void avant() {
//		System.out.println("Avant saluer");
//	}
//	@After("execution(public void org.eclipse.nation.French.saluer(..))")
//	public void apres() {
//		System.out.println("Apres saluer");
//	}

//	@Pointcut("execution(* org.eclipse.nation.French.saluer(..))")
//	public void log() {}
//	@Before("log()")
//	public void avant() {
//		System.out.println("Avant saluer");
//	}
//	@After("log()")
//	public void apres() {
//		System.out.println("Apres saluer");
//	}
	
//	@Around("execution(* org.eclipse.nation.French.saluer(..))")
//	public Object frenchAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
//		System.out.println("Avant d’appeler saluer");
//		Object value = null;
//		try {
//			value = proceedingJoinPoint.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		System.out.println("apres l’appel de saluer " + value);
//		return value;
//	}
	
//	@Around("execution(* org.eclipse.nation.*nch.saluer(..)) && args(i)")
//	public Object frenchAroundAdvice(ProceedingJoinPoint proceedingJoinPoint , int i){
//		System.out.println("Valeur du parametre i dans saluer : " + i);
//		System.out.println("Signature : " + proceedingJoinPoint.getSignature());
//		Object value = null;
//		try {
//			value = proceedingJoinPoint.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		System.out.println("Valeur de retour de saluer : " + value);
//		return value;
//	}

//	@Around("execution(* org.eclipse.nation.*nch.saluer(..))")
//	public Object frenchAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
//		System.out.println("Valeur du parametre i dans saluer : " + proceedingJoinPoint.getArgs()[0]);
//		System.out.println("Signature : " + proceedingJoinPoint.getSignature());
//		Object value = null;
//		try {
//			value = proceedingJoinPoint.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		System.out.println("Valeur de retour de saluer : " + value);
//		return value;
//	}

//	@Around("within(org.eclipse.nation..*)")
//	public Object frenchAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
//		System.out.println("Valeur du parametre i dans saluer : " + proceedingJoinPoint.getArgs()[0]);
//		System.out.println("Signature : " + proceedingJoinPoint.getSignature());
//		Object value = null;
//		try {
//			value = proceedingJoinPoint.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		System.out.println("Valeur de retour de saluer : " + value);
//		return value;
//	}
	 
	public Object frenchAroundAdvice(ProceedingJoinPoint proceedingJoinPoint ){
		System.out.println("Valeur de parametre i dans saluer : " + proceedingJoinPoint.getArgs()[0]);
		System.out.println("Signature : " + proceedingJoinPoint.getSignature());
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Fin de saluer avec une valeur de retour : " +
				value);
		return value;
	}

	
}
