package ru.itis.javalab.plagiarism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import ru.itis.javalab.plagiarism.app.properties.FileStorageProperties;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
@EnableSwagger2
public class AntiPlagiarismMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntiPlagiarismMicroserviceApplication.class, args);
	}

	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("ru.itis.javalab.plagiarism.app.controllers"))
				.paths(PathSelectors.any())
				.build();
	}

}
