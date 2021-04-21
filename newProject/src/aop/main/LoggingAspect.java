package aop.main;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class LoggingAspect {
	//oli for triangle class
	//@Before("execution(public String aop.model.*.getName())") //-----for all getName method in the package
	
	
	//@Before("execution(public String aop.model.Triangle.getName())")
	
	//@Before("execution(* aop..*.get*())")
	
	//@Before("execution(* aop.model..*.*(..))")
    
	@Before("allGeters()")
	public void loggingAdvice() {
		System.out.println("writing log before method is executed");
	}
	
	/*@Before("execution(* aop.model..*.*(..))")

	*public void secondAdvice() {
	*	System.out.println("second log before method is executed");
	*}
	
	
	*@Before("execution(* aop.model..*.*(..))")

	*public void thirdAdvice() {
	*	System.out.println("third log before method is executed");
	*}
	*/
	
	@Pointcut("execution(* aop..*.get*())")
	public void allGetters() {}
	
	

}
