package io.tsidgenerator.tsidgenerator;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(final CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:4200", "https://tsidgenerator-frontend.onrender.com", "http://localhost:8080")
            .allowedMethods("GET", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}