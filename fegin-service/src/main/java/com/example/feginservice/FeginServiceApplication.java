package com.example.feginservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 声明性REST客户端：Feign
 * Client feignClient：如果Ribbon启用，则为LoadBalancerFeignClient，否则将使用默认的feign客户端。
 * 可以通过将feign.okhttp.enabled或feign.httpclient.enabled设置为true，并将它们放在类路径上来使用OkHttpClient和ApacheHttpClient feign客户端。
 */
@ComponentScan
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeginServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeginServiceApplication.class, args);
	}
}
