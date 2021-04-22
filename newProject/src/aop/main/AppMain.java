package aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.service.FactoryService;
import aop.service.ShapeService;

public class AppMain {
	public static void main(String[] args) {
		
		FactoryService context = new FactoryService();
		ShapeService shapeService = (ShapeService) context.getBean("shapeService");
		
		
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
		//ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
		//System.out.println(shapeService.getTriangle().setName("isoceless"));
		//System.out.println(shapeService.getCircle().getDia());
		//shapeService.getCircle().setName("incircle");
		System.out.println(shapeService.getCircle().getName());
		}

}
