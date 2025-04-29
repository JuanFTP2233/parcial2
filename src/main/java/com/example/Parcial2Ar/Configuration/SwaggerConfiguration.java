package com.example.Parcial2Ar.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Api Estudiante")
                        .version("1.0")
                        .description("Documentacion Api para gestion estudiantil")
                        .contact(new Contact()
                                .name("Juan Tarazona")
                                .email("tarazonapitajuanfelipe@gmail.com")));
    }
}
