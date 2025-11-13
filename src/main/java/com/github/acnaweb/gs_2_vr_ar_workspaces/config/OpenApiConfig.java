package com.github.acnaweb.gs_2_vr_ar_workspaces.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("GS-2 VR/AR Workspaces API")
                        .version("1.0.0")
                        .description("API de integração para Ambientes de trabalho com Realidade Virtual ou Aumentada")
                        .contact(new Contact()
                                .name("Equipe GS-2")
                                .email("contato@gs2.com")));
    }
}

