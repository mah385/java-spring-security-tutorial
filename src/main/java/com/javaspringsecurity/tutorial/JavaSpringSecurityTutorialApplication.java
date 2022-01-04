package com.javaspringsecurity.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringSecurityTutorialApplication {

    //Note: In Form Based Authentication, we have separate API Endpoints for Login and Logout
    //need to cover Form Based Authentication in detail

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringSecurityTutorialApplication.class, args);
    }

    /*@Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("JavaSpringSecurityTutorialApplication API").version("1.0v")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }*/

}
