package aop.main;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public * get*()")
	public void loggingAdvice() {
		System.out.println("");
	}
	
	
	

}
