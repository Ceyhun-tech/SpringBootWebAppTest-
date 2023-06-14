package com.example.teacher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
@Configuration
public class MySwagger {
    @Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Ceyhun Swagger project")
                        .description("Bu proyekt SpringBoot tətbiqinin dokumentasiyasidi")
                        .version("1.0"));
    }
}
