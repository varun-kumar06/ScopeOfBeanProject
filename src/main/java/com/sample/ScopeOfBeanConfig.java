package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScopeOfBeanConfig implements CommandLineRunner {
	
	@Autowired
	ApplicationContext ac;
	
	
		public void run(String...args) throws Exception {
			
			EmployeeComponent e1= ac.getBean(EmployeeComponent.class);
			System.out.println(e1);
			
			EmployeeComponent e2= ac.getBean(EmployeeComponent.class);
			//e2.setName("SoftwareEmployee");
			System.out.println(e2);
			
			EmployeeComponent e3= ac.getBean(EmployeeComponent.class);
			System.out.println(e3);
		}
		
//		@Bean
//		public EmployeeComponent e() {
//			return new EmployeeComponent();
//		}

}
