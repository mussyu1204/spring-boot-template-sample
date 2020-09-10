package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.FileTemplateResolver;

@SpringBootApplication
@MapperScan("com.example.demo.domain")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ClassLoaderTemplateResolver secondaryTemplateResolver() {
		ClassLoaderTemplateResolver secondaryTemplateResolver = new ClassLoaderTemplateResolver();
		//secondaryTemplateResolver.setPrefix("file://C:/Users/shint/work/spring-boot-sample/external_dir/"); // Not use.
		secondaryTemplateResolver.setPrefix("templates-2/");
		secondaryTemplateResolver.setSuffix(".html");
		secondaryTemplateResolver.setTemplateMode(TemplateMode.HTML);
		secondaryTemplateResolver.setCharacterEncoding("UTF-8");
		secondaryTemplateResolver.setOrder(2);
		secondaryTemplateResolver.setCheckExistence(true);

		return secondaryTemplateResolver;
	}

	@Bean
	public FileTemplateResolver  thirdTemplateResolver() {
		FileTemplateResolver  thirdTemplateResolver = new FileTemplateResolver ();
//		thirdTemplateResolver.setPrefix("C:\\Users\\shint\\work\\spring-boot-sample\\external_dir\\");
		thirdTemplateResolver.setPrefix("C:\\Users\\sayori\\IdeaProjects\\spring-boot-template-sample\\external_dir\\");
		thirdTemplateResolver.setSuffix(".html");
		thirdTemplateResolver.setTemplateMode(TemplateMode.HTML);
		thirdTemplateResolver.setCharacterEncoding("UTF-8");
		thirdTemplateResolver.setOrder(3);
		thirdTemplateResolver.setCheckExistence(true);
		thirdTemplateResolver.setCacheTTLMs(10000L);

		return thirdTemplateResolver;
	}

}
