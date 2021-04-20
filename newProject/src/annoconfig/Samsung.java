package annoconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	@Autowired
	Microprocessor cpu;
	
	public Microprocessor getCpu() {
		return cpu;
	}

	public void setCpu(Microprocessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("octa core");
		cpu.processor();
	}

}
