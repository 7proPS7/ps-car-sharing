package com.carsharing.ps.pscarsharing;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Car sharing API", version = "1.0.1", description = "Simple Car sharing app"))
public class PsCarSharingApplication {
    public static void main(String[] args) {
        SpringApplication.run(PsCarSharingApplication.class, args);
    }
}
