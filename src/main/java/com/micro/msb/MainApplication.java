/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.micro.msb;

import com.micro.msb.connector.ServiceConnector;
import java.util.concurrent.Executors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author T420
 */
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableSwagger2
public class MainApplication implements CommandLineRunner {

    @Autowired
    private ServiceConnector serviceConnector;

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(MainApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        Executors.newFixedThreadPool(1).execute(serviceConnector);	
    }
    
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()                
                .apis(RequestHandlerSelectors.basePackage("com.micro.msb"))
                .build()
                .apiInfo(apiInfo())
                .tags(new Tag("microsb","User Administration"));
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Micro Service Bus (Sample)")
                .description("Sample Bridging Protocol for KOMA Network")
                .version("1.0.0")
                .contact(new Contact("Yan Yan Purdiansah","https://www.facebook.com/groups/202989604443240/", "yypurdi@gmail.com"))
                .build();
    }    
}
