package basics.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Tyre {
	
	@Bean
	public Car getRide() {
		return new Car();
	}
	/*private String brand;

	
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}


	public String getBrand() {
		return brand;
	}

	@Bean
	public void setBrand(String brand) {
		this.brand = brand;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tyre brand : "+brand;
		//super.toString();
	}*/

}
