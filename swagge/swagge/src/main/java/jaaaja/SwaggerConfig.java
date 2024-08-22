package jaaaja;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public boolean publicApi() {
        return GroupedOpenApi.builder();
}
}