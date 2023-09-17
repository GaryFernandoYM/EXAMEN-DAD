package com.example.msdetalleventa;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


@SpringBootApplication
public class MsDetalleVentaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsDetalleVentaApplication.class, args);
    }
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("OPEN API MICROSERVICIO DETALLE-VENTA")
                .version("0.0.1")
                .description("servicios web detalle-venta")
                .termsOfService("http://swagger.io/terms")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"))

        );
    }
}
