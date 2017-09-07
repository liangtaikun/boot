package com.taikun.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //注解等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan：
public class firstbootApplication {
	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(firstbootApplication.class, args);        
}
}
