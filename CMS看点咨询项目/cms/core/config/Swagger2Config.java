package com.briup.cms.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//开启springboot对swagger的支持
@EnableSwagger2
@Configuration
public class Swagger2Config {
	
	/**
	 * 需要配置扫描controller的包路径
	 */
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				//设置基本信息
				.apiInfo(apiInfo())
				//初始化并返回一个API选择构造器
				.select()
				//指定扫描的Controller包结构
				.apis(RequestHandlerSelectors.basePackage("com.briup.cms.web.controller"))
				//设置路径筛选
				.paths(PathSelectors.any())
				//构建
				.build();
	}
	
	//swagger界面中显示的基本信息
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("CMS企业智慧中台系统")
				.description("欢迎访问briup官网，http://www.briup.com")
				.termsOfServiceUrl("http://www.briup.com")
				.version("1.0")
				.build();
	}
}
