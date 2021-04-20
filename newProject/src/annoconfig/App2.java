package annoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 = context.getBean(Samsung.class);
		
	//Samsung s7 = new Samsung();
	s7.config();
}
}
