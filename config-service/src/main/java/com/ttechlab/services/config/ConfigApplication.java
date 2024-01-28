package com.ttechlab.services.config;

//import com.ttechlab.services.config.resolver.ProfileBasedApplicationEnvironmentResolver;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer

public class ConfigApplication {

	public static void main(String[] args) {
		//System.setProperty("spring.profiles.active", "docker, native");
		new SpringApplicationBuilder(ConfigApplication.class).run(args);
	}

//	@Bean
//	ProfileBasedApplicationEnvironmentResolver profileBasedApplicationEnvironmentResolver(){
//		return new ProfileBasedApplicationEnvironmentResolver();
//	}

}
