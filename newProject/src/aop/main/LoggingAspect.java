package aop.main;

import org.aspectj.lang.JoinPoint;
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

	//@Before("allGeters()")
	
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		//System.out.println(joinPoint.toLongString());
		
		String methodName = joinPoint.toLongString();
		if(methodName.contains("getDia")) {
		System.out.println("writing log before method is executed");
		}
		else 
			if(methodName.contains("setName")) {
				System.out.println("writing log for setName method before its executed");
			}
	}


	@Pointcut("execution(* aop..*.get*())")
	public void allGetters() {}
	
	//@Pointcut("execution(* *aop.model.Circle.*(..))")
	//public void allCircleMethods() {}
	
	@Pointcut("within(aop.model.Circle)")
		public void allCircleMethods() {}


}
