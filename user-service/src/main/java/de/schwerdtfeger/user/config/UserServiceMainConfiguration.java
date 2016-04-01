package de.schwerdtfeger.user.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import de.schwerdtfeger.user.UserServiceApplication;

@Configuration
@EnableFeignClients(basePackageClasses = UserServiceApplication.class)
public class UserServiceMainConfiguration {

}
