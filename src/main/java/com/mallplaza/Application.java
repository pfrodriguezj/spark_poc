package com.mallplaza;

import com.mallplaza.spark.CountryRepository;
import com.mallplaza.spark.SparkPocController;
import com.mallplaza.spark.SparkPocService;
import com.mallplaza.spark.SparkPocServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.mallplaza.spark"})
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        //SparkPocService sparkPocService = new SparkPocServiceImpl(ctx.getBean(CountryRepository.class));
        new SparkPocController(ctx.getBean(SparkPocService.class));
        ctx.registerShutdownHook();
    }

}