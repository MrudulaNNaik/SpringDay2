package basics.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoConfigOnTyre {
	public static void main(String[] args) {
		
	
	ApplicationContext context = new AnnotationConfigApplicationContext(Tyre.class);
	Car c = context.getBean(Car.class);
	c.drive();
	}

}
