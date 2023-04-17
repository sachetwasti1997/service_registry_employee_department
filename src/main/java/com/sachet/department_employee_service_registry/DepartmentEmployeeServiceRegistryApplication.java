package com.sachet.department_employee_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//makes project as eureka server
public class DepartmentEmployeeServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentEmployeeServiceRegistryApplication.class, args);
	}

}
