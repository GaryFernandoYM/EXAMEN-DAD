package com.example.msfacturacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class MsFacturacionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsFacturacionApplication.class, args);
    }
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("OPEN API MICROSERVICIO FACTURACION")
                .version("0.0.1")
                .description("servicios web facturacion")
                .termsOfService("http://swagger.io/terms")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"))

        );
    }
}
