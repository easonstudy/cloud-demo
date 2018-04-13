package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul的主要功能是 路由转发 和 过滤器
 * Zuul默认和Ribbon结合实现了负载均衡的功能。
 *zuul有以下功能：
		Authentication
		Insights
		Stress Testing
		Canary Testing
		Dynamic Routing
		Service Migration
		Load Shedding
		Security
		Static Response handling
		Active/Active traffic management
 */
@SpringBootApplication
//启动 zuul 代理
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
