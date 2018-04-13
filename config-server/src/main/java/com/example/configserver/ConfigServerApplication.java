package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 分布式配置中心组件spring cloud config ，
 * 		它支持配置服务放在配置服务的内存中（即本地），
 * 		也支持放在远程Git仓库中。在spring cloud config 组件中，
 * 分两个角色，
 * 		一是config server，
 * 		二是config client。
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
